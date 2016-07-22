<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>login</title>
	</head>

	<body>
	<form action="voildate.jsp">
	      使用者名稱：<input type="text" name="name"><br>
	      密碼：<input type="password" name="password"><br>
	<input type="submit" value="傳送"/>
	     <div id="error"><font color="red"><%
	      String message = (String)request.getAttribute("error");
	      if(null!=message) out.print(message);
	      %></font></div>	</form>
	</body>
</html>
