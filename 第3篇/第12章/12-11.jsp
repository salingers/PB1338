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
		<s:form action="x">
			<s:doubleselect label="請選取您喜歡的圖書" name="author" list="{'李', 'David'}"
				doubleList="top == '李' ? {'Spring2.0', 'J2EE' , 'Ajax'} : {'JavaScript: The Definitive Guide'}"
				doubleName="book" />
		</s:form>
	</body>
</html>
