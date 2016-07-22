<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<HTML>
<HEAD>
<TITLE>線上商品拍賣網</TITLE>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

<link href="/zxpm/style/mycss.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/texts.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/btn.css" rel="stylesheet" type="text/css" />
<style>
.table_title{
border:solid 1px #aaa;
border-width:0 0 1px 0;
}
</style>
</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 valign="top">

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="5"><img src="/zxpm/images/top.jpg" width="780" height="213"></td>
  </tr>
  <tr>
    <td colspan="5"><img src="/zxpm/images/middle1.jpg" width="780" height="47"></td>
  </tr>
  <tr>
    <td width="38" background="/zxpm/images/middle2.jpg">&nbsp;</td>
    <td width="172" valign="top"><%@ include file="in.jsp"%></td>
    <td width="35" background="/zxpm/images/layout_24.gif">&nbsp;</td>
    <td width="495">
	<table width="488" height="287">
		<tr>
			<td width="3%">&nbsp;</td>
			<td width="97%">
<script>
function fswitch(id){
	var o = document.getElementById(id);
	if (o){
		if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
	}
}
</script>
     <form action="user/addUser" method="post">
			<table id="advSearch" width="380" height="66">	
			<tr>				
				<td><s:textfield name="users.userName" label="使用者名稱" /></td>
			</tr>
			<tr>				
				<td><s:textfield name="users.password" label="密碼" /></td>
			</tr>
			<tr>			
				<td><s:textfield name="users.telephone" label="聯繫電話" /></td>
			</tr>
			<tr>			
				<td><s:textfield name="users.address" label="通信位址" /></td>
			</tr>
			<tr>			
				<td><s:submit align="left" value="登錄" /></td>				
			</tr>				
			</table>					
		</form>		
			</td>
		</tr>		
	</table>
	</td>
    <td width="40" background="/zxpm/images/middle4.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5"><img src="/zxpm/images/bottom.jpg" width="780" height="82"></td>
  </tr>
</table>
<P align="center">版權所有</P>
<br/>

</BODY>
</HTML>