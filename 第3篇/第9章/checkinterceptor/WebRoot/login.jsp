<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>struts2 �d�I���M��</title>
	</head>

	<body>
		<h1>
			�ϥΪ̵n�J
		</h1>
		<font color="red">${requestScope.tip}</font>
		<s:form id="id" action="login">
			<s:textfield name="name" label="�ϥΪ̦W��"></s:textfield>
			<s:password name="pass" label="�K�X"></s:password>
			<s:submit value="�n��"></s:submit>
		</s:form>
		<a href=chakan.action>�ݫ}�}^_^</a>
	</body>
</html>
