<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>長方形</title>

		<style>
.content {
	font-size: 12px;
}

#search_botton {
	border: 1px solid #8CC6FF;
	color: #0066CC;
	padding: 1px 1px;
	background-color: #f1f9ff;
}
</style>
	</head>
	<body>
		<s:form action="computeArea">
			<table border="0" class="content">
				<tr>
					<td>
						<s:textfield name="rectangle" label="長方形長和寬是(中間“,”隔開）" />
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="傳送" id="search_botton"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
