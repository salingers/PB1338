<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix = "s"  uri ="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>struts2 攔截器套用</title>
	</head>

	<body>
		<h1>使用者登錄</h1>
		<s:form id="id" action="helloaction">
			<s:textfield name="username" label="使用者名稱"></s:textfield>
			<s:password name="pass1" label="密碼"></s:password>
			<s:password name="pass2" label="重復密碼"></s:password>
			<s:submit value="登錄"></s:submit>
		</s:form>
	</body>
</html>
