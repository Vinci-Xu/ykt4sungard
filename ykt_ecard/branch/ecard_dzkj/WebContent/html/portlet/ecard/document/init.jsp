<%@ include file="/html/common/init.jsp" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.liferay.util.StringUtil" %>
<%@ page import="com.kingstargroup.ecard.hibernate.upload.UploadFiles" %>
<%@ page import="org.apache.struts.validator.DynaValidatorForm" %>
<%@ page import="com.kingstargroup.ecard.hibernate.information.EcardInformation" %>
<%@ page import="com.kingstargroup.ecard.hibernate.util.ResultPage" %>
<%@ page import="com.kingstargroup.ecard.hibernate.util.InformationUtil" %>
<%@ page import="com.kingstargroup.ecard.hibernate.util.UploadFileUtil" %>
<%@ page import="com.kingstargroup.ecard.util.EcardConstants" %>
<%@ page import="com.kingstargroup.ecard.util.PermissionUtil" %>
<%@ page import="com.kingstargroup.ecard.exceptions.FileSizeException" %>
<%@ page import="com.kingstargroup.ecard.exceptions.FileNameException" %>
<%@ page import="com.kingstargroup.ecard.util.DateFormatUtil" %>
<portlet:defineObjects />