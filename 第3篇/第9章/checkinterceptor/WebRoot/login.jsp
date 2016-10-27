<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>

	<s:form id="id" action="login">
		<s:textfield name="name" label="使用者名稱"></s:textfield>
		<s:password name="pass" label="密碼"></s:password>

		<s:submit value="登錄"></s:submit>
	</s:form>
</body>
</html>
