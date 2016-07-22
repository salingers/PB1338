<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title><s:text name="login.title" ></s:text></title>
	</head>
	<body>
		<a href="lang.action?request_locale=zh_CN">¤¤¤å</a>
		<a href="lang.action?request_locale=en_US">English</a>
		<s:form action="succ.action" method="post">
			<s:textfield name="userName" key="login.userName">
			</s:textfield>
			<s:textfield name="password" key="login.password">
			</s:textfield>
			<s:submit key="login.submit">
			</s:submit>
		</s:form>
	</body>
</html>
