<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用s:select產生下拉選取框</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:select產生下拉選取框
		</h3>
		<s:form>
			<!-- 使用簡單集合來產生下拉選取框 -->
			<s:select name="a" label="請選取您喜歡的圖書" labelposition="top"
				multiple="true"
			list="{'Spring2.0' , 'J2EE' , 'JavaScript: The Definitive Guide'}" />
			<!-- 使用簡單Map物件來產生下拉選取框 -->
			<s:select name="b" 
label="請選取您想選取出版日期" labelposition="top"
				list="#{'Spring2.0':'2006年10月' , 'J2EE':'2007月4月' , 'Ajax':'2007年6月'}"
				listKey="key" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
			<!-- 使用集合裡放多個JavaBean案例來產生下拉選取框 -->
			<s:select name="b" label="請選取您喜歡的圖書" labelposition="top"
				multiple="true" list="#bs.books" listKey="author"
 listValue="name" />
		</s:form>
	</body>
</html>
