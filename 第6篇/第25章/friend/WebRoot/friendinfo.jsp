<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>${ infoname }詳細訊息</title>
		<style type="text/css">
        	td{
				border-bottom-width: thin;
				border-bottom-style: solid;
				border-bottom-color: #CF3;
			}
        </style>
	</head>

	<body>
		${ infoname }詳細訊息如下：
		<hr color="#FAFAFA"/><br/><br/>
		<table width="60%" cellspacing="0" cellpadding="0">
			<tr>
				<td>
					朋友編號
				</td>
				<td>
					名字
				</td>
				<td>
					年齡
				</td>
				<td>
					性別
				</td>
				<td>
					聯繫模式
				</td>
			</tr>
			<s:iterator value="#request.friendinfolist">
				<tr>
					<td>
						<s:property value="iduser" />
					</td>
					<td>
						<a href="messageaction?name=${ nameuser }&username=${ user }" target="_blank" title="給好友留言"><s:property value="nameuser" /></a>
					</td>
					<td>
						<s:property value="ageuser" />
					</td>
					<td>
						<s:property value="sexuser" />
					</td>
					<td>
						<s:property value="emailuser" />
					</td>
				</tr>
			</s:iterator>
		</table>


	</body>
</html>
