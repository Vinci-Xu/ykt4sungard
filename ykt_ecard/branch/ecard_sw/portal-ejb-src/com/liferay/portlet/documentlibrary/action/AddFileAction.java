/**
 * Copyright (c) 2000-2005 Liferay, LLC. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.documentlibrary.action;

import com.liferay.documentlibrary.DuplicateFileException;
import com.liferay.documentlibrary.FileNameException;
import com.liferay.documentlibrary.FileSizeException;
import com.liferay.portal.auth.PrincipalException;
import com.liferay.portal.struts.PortletAction;
import com.liferay.portal.util.Constants;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.FileProfileReadRolesException;
import com.liferay.portlet.documentlibrary.FileProfileWriteRolesException;
import com.liferay.portlet.documentlibrary.NoSuchRepositoryException;
import com.liferay.portlet.documentlibrary.service.spring.DLFileProfileServiceUtil;
import com.liferay.util.FileUtil;
import com.liferay.util.ParamUtil;
import com.liferay.util.StringUtil;
import com.liferay.util.servlet.SessionErrors;
import com.liferay.util.servlet.UploadPortletRequest;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import javax.servlet.jsp.PageContext;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * <a href="AddFileAction.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 * @version $Revision: 1.4 $
 *
 */
public class AddFileAction extends PortletAction {

	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig config,
			ActionRequest req, ActionResponse res)
		throws Exception {

		try {
			ActionUtil.getRepository(req);

			String cmd = req.getParameter(Constants.CMD);

			if (cmd == null) {
				setForward(req, "portlet.document_library.add_file");

				return;
			}

			UploadPortletRequest uploadReq =
				PortalUtil.getUploadPortletRequest(req);

			String repositoryId = ParamUtil.getString(
				uploadReq, "repository_id");

			String path = ParamUtil.get(uploadReq, "file_path", "");

			String readRoles = ParamUtil.getString(uploadReq, "file_rr");
			String writeRoles = ParamUtil.getString(uploadReq, "file_wr");

			byte[] bytes = FileUtil.getBytes(
				uploadReq.getFile("file_location"));

			if (bytes == null || bytes.length == 0) {
				throw new FileSizeException();
			}

			String fileName = uploadReq.getFileName("file_location");
			fileName = StringUtil.replace(path + "/" + fileName, "//", "/");

			DLFileProfileServiceUtil.addFile(
				repositoryId, fileName, readRoles, writeRoles, bytes);

			// Send redirect

			res.sendRedirect(ParamUtil.getString(req, "redirect"));
		}
		catch (Exception e) {
			if (e != null &&
				e instanceof DuplicateFileException ||
				e instanceof FileNameException ||
				e instanceof FileProfileReadRolesException ||
				e instanceof FileProfileWriteRolesException ||
				e instanceof FileSizeException) {

				SessionErrors.add(req, e.getClass().getName());

				setForward(req, "portlet.document_library.add_file");
			}
			else if (e != null &&
					 e instanceof NoSuchRepositoryException ||
					 e instanceof PrincipalException) {

				SessionErrors.add(req, e.getClass().getName());

				setForward(req, "portlet.document_library.error");
			}
			else {
				req.setAttribute(PageContext.EXCEPTION, e);

				setForward(req, Constants.COMMON_ERROR);
			}
		}
	}

}