<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>�n�J����</title>
  </head>
  
  <body>
  	<s:form action="login">
  		<s:textfield name="user" label="�ϥΪ̦W��"></s:textfield>
  		<s:password name="pass" label="�K�X��"></s:password>
  		
  		<s:submit value="�n�J"></s:submit>
  	</s:form>
  </body>
</html>
