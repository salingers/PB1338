<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>${ user }正在加入好友</title>
	</head>

	<body>

		<span style="font-weight: bold;">${ user },你可以加入以下MM或GG為好友：</span>
		<br /><br/><hr color="#FAFAFA"//><br /><br/>
			<s:iterator value="#request.alluser">

				<a href="friendinfoaction?name=${ nameuser }" target="_blank" title="檢視此使用者訊息"><s:property value="nameuser"  /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="addfriendaction?me=${ user }&user=${ nameuser }" target="_blank" title="檢視此使用者訊息">火速加為好友</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<hr width="40%" color="#CF3" align="left"/>
			</s:iterator>
	</body>
</html>
