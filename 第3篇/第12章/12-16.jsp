<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用s:optgroup產生下拉選取框的選項群組</title>
		<s:head />
	</head>
	<body>
		<h3>
			使用s:optgroup產生下拉選取框的選項群組
		</h3>
		<s:form>
			<!-- 使用Map物件來產生下拉選取框的選項群組 -->
			<s:select label="選取您喜歡的圖書" name="book"
				list="#{'Spring2.0':'李剛','J2EE':'李','Ajax寶典':'李'}" listKey="value"
				listValue="key">
				<s:optgroup label="Rod Johnson"
					list="#{'Expert One-on-One J2EE Design and Development':'Johnson'}"
					listKey="value" listValue="key" />
				<s:optgroup label="David Flanagan"
					list="#{'JavaScript: The Definitive Guide':'David'}"
					listKey="value" listValue="key" />
			</s:select>
		</s:form>
	</body>
</html>
