<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title><s:text name="title"></s:text></title>
</head>

<body>
	<s:text name="content"></s:text>
	
	<s:form action="resourceaction">
		<s:textfield name="user" key="user"></s:textfield>
		<s:password name="pass" key="pass"></s:password>
		<s:submit key="submit"></s:submit>
	</s:form>
</body>
</html>
