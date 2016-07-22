<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>留言清單</title>
        <style type="text/css">
        	td{
				border-bottom-width: thin;
				border-bottom-style: solid;
				border-bottom-color: #CF3;
			}
        </style>
	</head>

	<body>
		<hr color="#FAFAFA"/>
		<span style="font-weight: bold; color:#F93">最新留言</span><br><br>
		<table  width="60%" cellspacing="0" cellpadding="0">
			<tr>
				<td>留言使用者</td>
				<td>留言時間</td>
				<td>留言內容</td>
			</tr>
			<s:iterator value="#request.messagelist">
				<tr>
					<td width="20%">
						<a href="messageaction?name=${ liuname }&username=${ user }" target="_blank" title="給好友留言"><s:property value="liuname" /></a>
					</td>
					<td width="30%">
						<s:property value="messagetime" />
					</td>
					<td width="60%">
						<s:property value="message" />
					</td>
				</tr>
			</s:iterator>
		</table>
        <p  style="text-align:right; width:80%"><a href="allmessageaction?name=${ user }" target="_blank">更多留言…</a></p>
	</body>
</html>
