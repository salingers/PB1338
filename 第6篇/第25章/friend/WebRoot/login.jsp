<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>使用者登入</title>
  </head>
  
  <body>
    <h2 align="center">使用者登入</h2>
    <s:form action="loginaction">
    	<s:textfield name="nameuser" label="使用者名稱"></s:textfield>
    	<s:password name="passworduser" label="密碼"></s:password>
    	<s:submit value="登入"></s:submit>
    </s:form>
    <hr color="#FAFAFA"/>
    <a href="register.jsp">新使用者登錄</a>
  </body>
</html>
