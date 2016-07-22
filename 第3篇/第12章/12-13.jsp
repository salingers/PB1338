<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>
使用s:optiontransferselect來產生抽取式清單項的下拉式選單
</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:optiontransferselect來產生抽取式清單項的下拉式選單
		</h3>
		<s:form>
			<!-- 使用簡單集合物件來產生抽取式的下拉式選單 -->
			<s:optiontransferselect label="請選取你喜歡的圖書" name="cnbook"
				leftTitle="中文圖書：" rightTitle="外文圖書"
				list="{'Spring2.0','J2EE','Ajax'}" multiple="true"
				addToLeftLabel="向左搬移" selectAllLabel="全部選取"
				addAllToRightLabel="全部右移" headerKey="cnKey"
				headerValue="--- 選取中文圖書 ---" emptyOption="true"
				doubleList="{'Expert One-on-One J2EE Design and Development', 
'JavaScript: The Definitive Guide'}"
				doubleName="enBook" doubleHeaderKey="enKey"
				doubleHeaderValue="--- 選取外文圖書 ---" 
doubleEmptyOption="true"
				doubleMultiple="true" />
		</s:form>
	</body>
</html>
