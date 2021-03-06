<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>登錄</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<!-- 匯入dwr/interface/CheckUserExist.js和dwr/engine.js，這兩個指令稿中定義了CheckUserExist指令稿物件  -->
<script src="dwr/interface/CheckUserExist.js"></script>
<script src="dwr/engine.js"></script>
<!-- 匯入dwr/util.js，其中包括一些工具方法 -->
<script src="dwr/util.js"></script>
<script language="javascript">
    //當使用者名稱輸入框失去焦點觸發onblur事件時，呼叫該方法
	function checkUserExists(textBox){ 
		var username = textBox.value;
		//傳送請求到伺服器，透過CheckUserExist指令稿物件直接呼叫
		//UserManager類別中的checkUserExist，判斷使用者名稱是否存在。
		//callBackFunction為處理響應資料的函數的函數名
		CheckUserExist.checkUserExist(username,callBackFunction);
	}
	//處理響應資料的函數，DWR框架會將UserManager類別中的
	//checkUserExist方法執行結果傳給函數的參數isExist。
	function callBackFunction(isExist){		
        if (isExist==1){
            alert("使用者名稱已經存在，請換個使用者名稱！");
        }else if(isExist==0){
			alert("使用者名稱可以使用");
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
				<td>使用者登錄：</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><hr/></td>
			</tr>
			<tr>				
				<td><s:textfield name="loginName" label="使用者名稱" onblur="return checkUserExists(this);"  /></td>
			</tr>
				<td> <s:textfield name="loginPwd" label="密碼" /></td>
			<tr>
				<td><input type="submit" value="登錄" class="btn">&nbsp;</td>
				<td><input type="reset" value="重設" class="btn"></td>
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
