<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>使用者登錄-聚友網</title>
  </head>
  
  <body>
    <h2 align="center">使用者登錄</h2>
    <s:form action="regaction">
    	<s:textfield name="nameuser" label="使用者名稱"></s:textfield>
    	<s:password name="passworduser" label="密碼"></s:password>
    	<s:textfield name="ageuser" label="年齡"></s:textfield>
    	<s:textfield name="sexuser" label="性別"></s:textfield>
    	<s:textfield name="emailuser" label="信箱"></s:textfield>
    	<s:submit value="登錄"></s:submit>
    </s:form>
    <hr color="#FAFAFA"/>
    <a href="login.jsp">已有賬戶登入</a>
  </body>
</html>
