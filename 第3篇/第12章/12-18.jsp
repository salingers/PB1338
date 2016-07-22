<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
		<title>ㄏノs:updownselect玻ネ穐簿匡兜┰匡</title>
		<s:head />
	</head>
	<body>
		<h3>
			ㄏノs:updownselect玻ネ穐簿匡兜┰匡
		</h3>
		<s:form>
			<!-- ㄏノ虏虫栋ㄓ玻ネ穐簿匡兜┰匡 -->
			<s:updownselect name="a" label="叫匡眤尺舧瓜" labelposition="top"
				moveUpLabel="穐簿"
				list="{'Spring2.0' , 'J2EE' , 'JavaScript: The Definitive Guide'}" />
			<!-- ㄏノ虏虫Mapンㄓ玻ネ穐簿匡兜┰匡
ㄏノemptyOption="true"糤匡兜-->
			<s:updownselect name="b" label="叫匡眤稱匡ら戳" labelposition="top"
				moveDownLabel="穐簿"
				list="#{'Spring2.0':'200610る' , 'J2EE':'2007る4る' , 'Ajax':'20076る'}"
				listKey="key" emptyOption="true" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
		<!-- ㄏノ栋柑JavaBeanㄒㄓ穐簿匡兜玻ネ┰匡 -->
			<s:updownselect name="c" label="叫匡眤尺舧瓜" labelposition="top"
				selectAllLabel="场匡" multiple="true" list="#bs.books"
				listKey="author" listValue="name" />
		</s:form>
	</body>
</html>
