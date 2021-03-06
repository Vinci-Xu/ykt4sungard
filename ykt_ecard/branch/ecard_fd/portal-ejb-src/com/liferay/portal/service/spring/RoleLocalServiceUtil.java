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

package com.liferay.portal.service.spring;

/**
 * <a href="RoleLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 * @version $Revision: 1.183 $
 *
 */
public class RoleLocalServiceUtil {
	public static boolean addGroup(java.lang.String roleId,
		java.lang.String groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addGroup(roleId, groupId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addGroup(java.lang.String roleId,
		com.liferay.portal.model.Group group)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addGroup(roleId, group);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addGroups(java.lang.String roleId,
		java.lang.String[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addGroups(roleId, groupIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addGroups(java.lang.String roleId,
		java.util.List groups)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addGroups(roleId, groups);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static com.liferay.portal.model.Role addRole(
		java.lang.String companyId, java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addRole(companyId, name);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addUser(java.lang.String roleId,
		java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addUser(roleId, userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addUser(java.lang.String roleId,
		com.liferay.portal.model.User user)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addUser(roleId, user);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addUsers(java.lang.String roleId,
		java.lang.String[] userIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addUsers(roleId, userIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean addUsers(java.lang.String roleId, java.util.List users)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.addUsers(roleId, users);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void checkSystemRoles(java.lang.String companyId)
		throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.checkSystemRoles(companyId);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean deleteGroup(java.lang.String roleId,
		java.lang.String groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.deleteGroup(roleId, groupId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean deleteGroup(java.lang.String roleId,
		com.liferay.portal.model.Group group)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.deleteGroup(roleId, group);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void deleteRole(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.deleteRole(roleId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean deleteUser(java.lang.String roleId,
		java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.deleteUser(roleId, userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean deleteUser(java.lang.String roleId,
		com.liferay.portal.model.User user)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.deleteUser(roleId, user);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean exists(java.lang.String companyId,
		java.lang.String name) throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.exists(companyId, name);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean exists(java.lang.String companyId,
		java.lang.String[] names) throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.exists(companyId, names);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static java.util.List getGroups(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getGroups(roleId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static java.util.List getGroups(java.lang.String roleId, int begin,
		int end)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getGroups(roleId, begin, end);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static int getGroupsSize(java.lang.String roleId)
		throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getGroupsSize(roleId);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static com.liferay.portal.model.Role getRoleById(
		java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getRoleById(roleId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static com.liferay.portal.model.Role getRoleByName(
		java.lang.String companyId, java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getRoleByName(companyId, name);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static java.lang.String getRoleId(java.lang.String companyId,
		java.lang.String name) throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getRoleId(companyId, name);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static java.util.List getUsers(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getUsers(roleId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static java.util.List getUsers(java.lang.String roleId, int begin,
		int end)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getUsers(roleId, begin, end);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static int getUsersSize(java.lang.String roleId)
		throws com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.getUsersSize(roleId);
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean hasRole(java.lang.String userId,
		java.lang.String roleName)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.hasRole(userId, roleName);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean hasRole(java.lang.String userId,
		java.util.List userRoles, java.lang.String roleName)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.hasRole(userId, userRoles, roleName);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean hasRoles(java.lang.String userId,
		java.lang.String[] roleNames)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.hasRoles(userId, roleNames);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean hasRoles(java.lang.String userId,
		java.util.List userRoles, java.lang.String[] roleNames)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.hasRoles(userId, userRoles, roleNames);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean isAdministrator(java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.isAdministrator(userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean isGuest(java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.isGuest(userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean isPowerUser(java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.isPowerUser(userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean isUser(java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.isUser(userId);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean removeGroups(java.lang.String roleId,
		java.lang.String[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.removeGroups(roleId, groupIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean removeGroups(java.lang.String roleId,
		java.util.List groups)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.removeGroups(roleId, groups);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean removeUsers(java.lang.String roleId,
		java.lang.String[] userIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.removeUsers(roleId, userIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static boolean removeUsers(java.lang.String roleId,
		java.util.List users)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.removeUsers(roleId, users);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static com.liferay.portal.model.Role renameRoleById(
		java.lang.String roleId, java.lang.String newName)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.renameRoleById(roleId, newName);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static com.liferay.portal.model.Role renameRoleByName(
		java.lang.String companyId, java.lang.String oldName,
		java.lang.String newName)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();

			return roleLocalService.renameRoleByName(companyId, oldName, newName);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void setGroups(java.lang.String roleId,
		java.lang.String[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.setGroups(roleId, groupIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void setGroups(java.lang.String roleId, java.util.List groups)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.setGroups(roleId, groups);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void setUsers(java.lang.String roleId,
		java.lang.String[] userIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.setUsers(roleId, userIds);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void setUsers(java.lang.String roleId, java.util.List users)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.setUsers(roleId, users);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}

	public static void validate(java.lang.String companyId,
		java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		try {
			RoleLocalService roleLocalService = RoleLocalServiceFactory.getService();
			roleLocalService.validate(companyId, name);
		}
		catch (com.liferay.portal.PortalException pe) {
			throw pe;
		}
		catch (com.liferay.portal.SystemException se) {
			throw se;
		}
		catch (Exception e) {
			throw new com.liferay.portal.SystemException(e);
		}
	}
}