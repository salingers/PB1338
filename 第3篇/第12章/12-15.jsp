<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用s:radio產生多個單選框</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:radio產生多個單選框
		</h3>
		<s:form>
			<!-- 使用簡單集合來產生多個單選框 -->
			<s:radio name="a" label="請選取您喜歡的圖書" labelposition="top"
				list="{'Spring2.0' , 'Spring In Action' , 'JavaScript: The Definitive Guide'}" />
			<!-- 使用簡單Map物件來產生多個單選框 -->
			<s:radio name="b" label="請選取您想選取出版日期" labelposition="top"
				list="#{'Spring2.0':'2006年10月' , 'J2EE':'2007月4月' , 'Ajax':'2007年6月'}"
				listKey="key" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
			<!-- 使用集合裡放多個JavaBean案例來產生多個單選框 -->
			<s:radio name="c" label="請選取您喜歡的圖書" labelposition="top"
				list="#bs.books" listKey="author" listValue="name" />
		</s:form>
	</body>
</html>
