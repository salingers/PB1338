<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>µn¿ý­¶­±</title>
	</head>

	<body>
		<s:form action="reg">
			<s:textfield name="name" label="¨Ï¥ÎªÌ¦WºÙ"></s:textfield>
			<s:textfield name="age" label="¦~ÄÖ"></s:textfield>
			<s:password name="pass1" label="±K½X®Ø"></s:password>
			<s:password name="pass2" label="­«´_±K½X"></s:password>
			
			<s:submit value="µn¿ý"></s:submit>
		</s:form>
	</body>
</html>
