<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�n������</title>
	</head>

	<body>
		<s:form action="reg">
			<s:textfield name="name" label="�ϥΪ̦W��"></s:textfield>
			<s:textfield name="age" label="�~��"></s:textfield>
			<s:password name="pass1" label="�K�X��"></s:password>
			<s:password name="pass2" label="���_�K�X"></s:password>
			
			<s:submit value="�n��"></s:submit>
		</s:form>
	</body>
</html>
