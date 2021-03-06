<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
		<title>使用s:updownselect產生可上下搬移選項的下拉選取框</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:updownselect產生可上下搬移選項的下拉選取框
		</h3>
		<s:form>
			<!-- 使用簡單集合來產生可上下搬移選項的下拉選取框 -->
			<s:updownselect name="a" label="請選取您喜歡的圖書" labelposition="top"
				moveUpLabel="向上搬移"
				list="{'Spring2.0' , 'J2EE' , 'JavaScript: The Definitive Guide'}" />
			<!-- 使用簡單Map物件來產生可上下搬移選項的下拉選取框
且使用emptyOption="true"增加一個空選項-->
			<s:updownselect name="b" label="請選取您想選取出版日期" labelposition="top"
				moveDownLabel="向下搬移"
				list="#{'Spring2.0':'2006年10月' , 'J2EE':'2007月4月' , 'Ajax':'2007年6月'}"
				listKey="key" emptyOption="true" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
		<!-- 使用集合裡放多個JavaBean案例來可上下搬移選項的產生下拉選取框 -->
			<s:updownselect name="c" label="請選取您喜歡的圖書的作者" labelposition="top"
				selectAllLabel="全部選取" multiple="true" list="#bs.books"
				listKey="author" listValue="name" />
		</s:form>
	</body>
</html>
