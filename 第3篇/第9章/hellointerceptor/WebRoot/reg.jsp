<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix = "s"  uri ="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>struts2 �d�I���M��</title>
	</head>

	<body>
		<h1>�ϥΪ̵n��</h1>
		<s:form id="id" action="helloaction">
			<s:textfield name="username" label="�ϥΪ̦W��"></s:textfield>
			<s:password name="pass1" label="�K�X"></s:password>
			<s:password name="pass2" label="���_�K�X"></s:password>
			<s:submit value="�n��"></s:submit>
		</s:form>
	</body>
</html>
