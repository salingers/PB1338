<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
 <html> 
	<head>
		<title>登入</title>
	</head>
	<body>
	   <s:form action="doLogin.action">
	     <table>
	       <tr>	       
	        <s:textfield name="loginName" label="使用者名稱"  /> 
	       </tr>
	       <tr>
	         <s:textfield name="loginPwd" label="密碼"  /> 
	       </tr>
	       <tr>
	         <s:submit value="確認"  /> 
	       </tr>	     
	     </table>
	   </s:form>
		
	</body>
</html>
