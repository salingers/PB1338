<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>祅魁</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<!-- 蹲dwr/interface/CheckUserExist.js㎝dwr/engine.js硂ㄢ絑い﹚竡CheckUserExist絑ン  -->
<script src="dwr/interface/CheckUserExist.js"></script>
<script src="dwr/engine.js"></script>
<!-- 蹲dwr/util.jsㄤい珹ㄇㄣよ猭 -->
<script src="dwr/util.js"></script>
<script language="javascript">
    //讽ㄏノ嘿块ア礘翴牟祇onblurㄆン㊣赣よ猭
	function checkUserExists(textBox){ 
		var username = textBox.value;
		//肚癳叫―狝竟硓筁CheckUserExist絑ン钡㊣
		//UserManager摸いcheckUserExist耞ㄏノ嘿琌
		//callBackFunction矪瞶臫莱戈ㄧ计ㄧ计
		CheckUserExist.checkUserExist(username,callBackFunction);
	}
	//矪瞶臫莱戈ㄧ计DWR琜穦盢UserManager摸い
	//checkUserExistよ猭磅︽挡狦肚倒ㄧ计把计isExist
	function callBackFunction(isExist){		
        if (isExist==1){
            alert("ㄏノ嘿竒叫传ㄏノ嘿");
        }else if(isExist==0){
			alert("ㄏノ嘿ㄏノ");
        } 
    }
</script>
</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">  
  <tr>   
    <td width="495">
	<form action="reg.action" method="post">
		<table align="center">
			<tr>
				<td>ㄏノ祅魁</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><hr/></td>
			</tr>
			<tr>				
				<td><s:textfield name="loginName" label="ㄏノ嘿" onblur="return checkUserExists(this);"  /></td>
			</tr>
				<td> <s:textfield name="loginPwd" label="盞絏" /></td>
			<tr>
				<td><input type="submit" value="祅魁" class="btn">&nbsp;</td>
				<td><input type="reset" value="砞" class="btn"></td>
			</tr>
		</table>
	</form>
	</td>    
  </tr>
  <tr>
    <td colspan="5"><br></td>
  </tr>
</table>
<br/>
</BODY>
</HTML>
