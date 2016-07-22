<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
	<table width="479" height="287" style="height: 287px;">
		<tr>
			<td width="3%">&nbsp;</td>
			<td width="97%">
<script>

function SwitchDisplay(oid){
	var o = document.getElementById(oid);
	if (o){
		if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
	}
}
</script>
	   <s:form action="upload" method="post" enctype="multipart/form-data">  
	     <s:file name="doc" label="請先選取上傳圖片"/>
	     <s:submit value="上傳"/>
	   </s:form>
			</td>
		</tr>
		<tr>
			<td colspan="2"></td>
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