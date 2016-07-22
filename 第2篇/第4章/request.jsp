<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>request簡單案例</title>
  </head>
  
  <body>
          <h1>request範例</h1><br>
          <%request.setAttribute("hello", "hello JSP");%>
          <jsp:forward page="request2.jsp"></jsp:forward>
  </body>
</html>
