<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Struts2用戶端驗證</title>
</head>

<body>
	<s:form action="yanzheng.action" validate="true">
		<s:textfield name="user" label="使用者"></s:textfield>
		<s:password name="pass" label="密碼"></s:password>
		
		<s:submit value="傳送"></s:submit>
	</s:form>
</body>
</html>
