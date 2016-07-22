<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<html>
  <head>
    <title>Page簡單案例</title>
  </head>
  
  <body>
           <h1>使用java.util.Date顯示目前的時間</h1>
           <%
              Date date = new Date();
              out.print("目前時間為"+date);
           %>
  </body>
</html>
