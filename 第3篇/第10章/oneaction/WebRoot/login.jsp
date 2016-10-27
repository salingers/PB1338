<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登入頁面</title>
  </head>
  
  <body>
  	<s:form action="login">
  		<s:textfield name="user" label="使用者名稱"></s:textfield>
  		<s:password name="pass" label="密碼框"></s:password>
  		
  		<s:submit value="登入"></s:submit>
  	</s:form>
  </body>
</html>
