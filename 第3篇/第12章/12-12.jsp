<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用s:doubleselect產生串聯下拉式選單</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:doubleselect產生串聯下拉式選單
		</h3>
		<s:set name="bs" value="#{'李': {'Spring2.0', 'J2EE','Ajax'},
'David': {'JavaScript: The Definitive Guide'},
'Johnson': {'Expert One-on-One J2EE Design and Development'}}" />
		<s:form action="x">
			<s:doubleselect label="請選取您喜歡的圖書" size="3" name="author"
				list="#bs.keySet()" doubleList="#bs[top]" doubleSize="3"
				doubleName="book" />
		</s:form>
	</body>
</html>
