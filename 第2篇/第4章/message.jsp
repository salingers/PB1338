<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>session簡單案例</title>
  </head>
  <%
      String name = (String)session.getAttribute("user");   
     if(null==name) request.getRequestDispatcher("login.jsp").forward(request,response);
  %>
  
  <body>
             <h1>歡迎來到JSP世界，Welcome JSP Word</h1>                       
  </body>
</html>
