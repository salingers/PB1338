<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <title>登入</title>
  </head>
  
  <body>
    <form action="/servlet/LoginServlet">
    	使用者名稱：<input type="text" name="user" /><br/><br/>
    	密碼：<input type="password" name="pass"/><br/><br/>
    	<input type="submit" value="登入"> 
    </form>
  </body>
</html>
