<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
		<title>使用s:token防止重復傳送</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:token防止重復傳送
		</h3>
		<s:form>
			<s:token />
		</s:form>
	</body>
</html>
