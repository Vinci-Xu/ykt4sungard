<%@ include file="/html/portlet/ecard/document/init.jsp" %>
<liferay:box top="/html/common/themes/inner_top.jsp"
		bottom="/html/common/themes/inner_bottom.jsp">
		<liferay:param name="box_title"
			value='<%= LanguageUtil.get(pageContext, "ecard.search") %>' />

<html:form action="/ecarddoc/search_result" method="POST"
	onsubmit="javascript:submitPortletForm(this); return false;">
	<table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td align="center">
			<table border="0" cellpadding="4" cellspacing="2">			
			<tr>
				<td>&nbsp;</td>
						<td align=left><font color=red style="font-size: x-small;"><html:errors
							property="title" /></font></td>
			</tr>
			<tr>
				<td>
					<font class="portlet-font" style="font-size: x-small;"><b>
					<bean:message key="ecard.title" />
					</b></font>
				</td>
				<td>
					<html:text property="title" styleClass="form-text" size="20" />
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
					<html:submit styleClass="portlet-form-button" property="search" value='<%= LanguageUtil.get(pageContext, "ecarddoc.button.search") %>' /> 
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<br>
				</td>
			</tr>			
			</table>
		</td>
	</tr>
	</table>
</html:form>
</liferay:box>