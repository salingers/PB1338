<%@ page language="java" import="com.han.bean.*" pageEncoding="gbk"%>

<html>
<head>

<title>�o���\</title>

</head>

<body>
	<%
		PostBean post = (PostBean) session.getAttribute("post");
		String postTitle = post.getPostTitle();
	%>
	<font color="red" size="10px">�o���\�I</font>
	<br /> �A�o���o�媺�D���O�G
	<%=postTitle%>
</body>
</html>
