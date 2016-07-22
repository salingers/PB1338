<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>session簡單案例</title>
  </head>
  
  <body>
            <%
                   String name = request.getParameter("name");
                   String password = request.getParameter("password");
                   if("zhangsan".equals(name)){
                	     if("123".equals(password)){
                	    	 session.setAttribute("user",name);
                	    	 response.sendRedirect("message.jsp");
                	     }else{
                	    	 request.setAttribute("error","密碼錯誤");
                	    	 request.getRequestDispatcher("login.jsp").forward(request,response);
                	     }
                   }else{
                	   	 request.setAttribute("error","使用者名稱錯誤");
          	    	 request.getRequestDispatcher("login.jsp").forward(request,response);
                   }
         %>                   
  </body>
</html>
