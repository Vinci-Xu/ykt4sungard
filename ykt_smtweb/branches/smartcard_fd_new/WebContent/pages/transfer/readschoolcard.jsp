<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="com.kingstargroup.fdykt.KSConfiguration" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ include file="/pages/init.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>读取校园卡</title>  
		<link href="<%=path%>/pages/css/css.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="<%=path%>/pages/js/other.js"></script>
		<script type="text/JavaScript">
		
		 function readCard()
          { 
          var serverbase = "http://"+'<%=webserverip%>'+":"+'<%=webserverport%>'+"/"+'<%=webserverapp%>'+"/";
          var msg = document.getElementById("msg");
          var device_port = <%=read_card_device_port%>;         
          readCardForm.all.RFScanner.PortNo=device_port;//读卡器端口设置
          var rrt = readCardForm.all.RFScanner.GetMainKey(serverbase+"getSysPara.do");
          var ret=readCardForm.all.RFScanner.DoScan();
          if(rrt == 0){
             if(ret==0){//读卡成功
              	readCardForm.all.cardno.value=document.all.RFScanner.CardNo;
              	var bala = readCardForm.all.RFScanner.GetPacketInfo("bala");
              	readCardForm.all.bala.value = bala;
              	readCardForm.submit();
          	 }else{
            //  msg.innerHTML="读卡失败，请正确放置卡片..." ;       
           	 }
           }else{
             errmsg.innerHTML="网络不通，请点取消退出系统";
			 return false;
           }
        }
        
		function MM_swapImgRestore() { //v3.0
		  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
		}
		
		function MM_preloadImages() { //v3.0
		  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
		    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
		    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
		}
		
		function MM_findObj(n, d) { //v4.01
		  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
		    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
		  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
		  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
		  if(!x && d.getElementById) x=d.getElementById(n); return x;
		}
		
		function MM_swapImage() { //v3.0
		  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
		   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
		}
		</script>
	</head>
	<body scroll="no" onkeydown="return (event.keyCode!=8)">
		<form  action="<%=path%>/readcardresult.do"  method="post"
			name="readCardForm">
			
			<input type="hidden" name="cardno"/>
		    <input type="hidden" name="bala"/>
			<div id="mid_top"></div>
			<div id="middle">
				<div id="Layer1">
					<div id="content">
						<div id="content_left"></div>
						<div id="content_middle">
								<div align="center">
								<img src="<%=path%>/pages/images/czjg.gif" width="314"
								height="82" />
							</div>

							<div id="content_input">
								<table width="50%" border="0" align="center" cellpadding="0"
									cellspacing="0" class="box">
									<tr>
										<td height="320" align="center" class="样式13">
											<b> 请放入校园卡，点确定
											<br/>
											<br/>
											 转帐中，请不要移动卡片</b>
										</td>
									</tr>

								</table>
							</div>
							<div id="content_buttom">
								  <table>
								<tr>
										<td align="left" width="200">
											<a onclick="javascript:readCard();"
												onmouseup="MM_swapImgRestore()"
												onmousedown="MM_swapImage('send','','<%=path%>/pages/images/senda.gif',1)"><img
													src="<%=path%>/pages/images/send.gif" name="send"
													width="109" height="48" border="0" id="send" /> </a>
										</td>
										<td  align="right" width="200">
											<a
												onclick="javascript: window.location='<%=path%>/index.do';"
												onmouseup="MM_swapImgRestore()"
												onmousedown="MM_swapImage('back','','<%=path%>/pages/images/backa.gif',1)"><img
													src="<%=path%>/pages/images/back.gif" name="back"
													width="109" height="48" border="0" id="back" /> </a>
										</td>
									</tr>	
								</table>
							</div>
						</div>
						<div id="content_right"></div>
					</div>
				</div>
			</div>
			<div id="bottom"></div>
			<object id="RFScanner"
				classid="clsid:{335AEB92-0D39-4999-A2B5-536A2C718901}" width="0"
				height="0" codebase="<%=path%>/rf35.cab#version=2,0,0,7" />
		</form>
	</body>
</html>



