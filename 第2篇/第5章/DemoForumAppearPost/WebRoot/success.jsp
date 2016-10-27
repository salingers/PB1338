<%@ page language="java" import="com.han.bean.*" pageEncoding="gbk"%>

<html>
<head>

<title>發表成功</title>

</head>

<body>
	<%
		PostBean post = (PostBean) session.getAttribute("post");
		String postTitle = post.getPostTitle();
	%>
	<font color="red" size="10px">發表成功！</font>
	<br /> 你發表的發文的主旨是：
	<%=postTitle%>
</body>
</html>
