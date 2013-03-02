<%@page pageEncoding="GBK"%>
<%@ include file="../tiles/include.jsp"%>
<html>
	<head>
		<title>������ѧУ԰һ��ͨ���ڹ���ϵͳ</title>
		<meta http-equiv="Content-Type" content="text/html;">

		<%@ include file="/pages/common/meta.jsp"%>
		<%@ include file="/pages/components/calendar/calendar.jsp"%>
		<link href="<c:url value="/pages/styles/admin.css"/>" type="text/css" rel=stylesheet>
		<link href="<c:url value="/pages/styles/extremecomponents.css"/>" type="text/css" rel=stylesheet>
		<script src="<c:url value="/pages/scripts/admin.js"/>" type="text/javascript"></script>
		<SCRIPT language=javascript>


			function back(){
			window.open('login.htm','_self');
			}
			function on_FD(){
				document.all("sd").click();
			}
			function on_validate(para){
				if(document.all(para).value!=''){
					document.forms[0].submit();
				}
				else{
					alert('��ѡ������');
				}
			}
			function validate()
			{
				var startDate=deptConf.search_startDate.value;
				var endDate=deptConf.search_endDate.value;
				if(startDate==''||endDate=='')
				{
					alert("�뽫������������");
					return false;
				}
				if(startDate>endDate)
				{		
					alert("��ʼ���ڲ��ܴ��ڽ���ʱ��");
					return false;
				}
			}
	</SCRIPT>
	</head>
	<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0">

		<div id="titleDiv" class="pageTitle">
			<strong> <font class="medium"> �����Ű���Ϣ </font> </strong>
		</div>
		<tr>
			&nbsp;
		</tr>
		<div id=lineDiv class="hrLine">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td class="tdborderLine"></td>
				</tr>
			</table>
		</div>
		<div id="filterDiv" style="text-align: left;">
			<form action="department.do?method=search" method="post" name="deptConf" onsubmit="return validate();">
				<jodd:form bean="request">
					&nbsp;
					<span class="medium"> ��ʼ���� </span> &nbsp;
					<input class="input_box" style="width: 100" name="search_startDate" readonly="readonly" value="<c:out value='${startDate}'/>">
					<img id="calBegin" src="<c:url value="/pages/components/calendar/skins/aqua/cal.gif"/>" border="0" alt="begin date" style="cursor:pointer">
					&nbsp;	
					��������
					
					&nbsp;
					<input name="search_endDate" class="input_box"  style="width: 100" readonly="readonly" value="<c:out value='${endDate}'/>">
					<img id="calEnd" src="<c:url value="/pages/components/calendar/skins/aqua/cal.gif"/>" border="0" alt="end date" style="cursor:pointer">
					<script type="text/javascript">
		                new calendar("search_startDate", "calBegin", "%Y-%m-%d");
		                new calendar("search_endDate", "calEnd", "%Y-%m-%d");
            		</script>
						&nbsp;
						&nbsp;
						����:&nbsp;
					<select name="search_deptId" style="width:120">
						<option value="">
							����
						</option>
						<c:forEach var="department" items="${departmentTree}">
							<option value="<c:out value="${department.deptId}"/>">
								<c:out value="${department.deptName}" />
							</option>
						</c:forEach>
					</select>
					<input type="button" value=" �� ѯ " class="submitButton" onclick="if(validate()==false) return false;deptConf.submit();" />
					&nbsp;&nbsp;&nbsp;
					<input type="button" value="�����Ű�ƻ�" class="submitButton" onclick="window.location.href='department.do?method=addConfStep1';" />
				</jodd:form>
			</form>
		</div>
		<div id=lineDiv class="hrLine">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td class="tdborderLine"></td>
				</tr>
			</table>
		</div>
		<div id="tableDiv">
			<ec:table items="dpConfList" var="dptconf" rowsDisplayed="15" action="department.do?method=search">
				<ec:exportXls fileName="deptConfList.xls" tooltip="���� Excel" />
				<ec:row>
					<ec:column property="checkbox" title="ѡ��" sortable="false" viewsAllowed="html" width="30" style="text-align: center">
						<input type="checkbox" name="itemlist" value="${dptconf.DEPT_ID}" style="border:0px" />
					</ec:column>
					<ec:column property="DEPT_NAME" title="����" width="100" />
					<ec:column property="BEGINDATE" title="����" width="30" />
					<ec:column property="WORKCONF_NAME" title="�����ƶ�" width="100" />
					<ec:column property="WORKTIME_NAME" title="����ʱ��" width="100" />
					<ec:column property="detailinfo" title="��ϸ��Ϣ" width="60" sortable="false" >
					<a href="department.do?method=getDeptConfDetail&pre_deptId=${dptconf.DEPT_ID}&pre_beginDate=${dptconf.BEGINDATE}" >��ϸ��Ϣ</a>
					</ec:column>

				</ec:row>
			</ec:table>
		</div>
	</body>
</html>