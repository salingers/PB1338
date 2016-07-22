<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.User" %>
<html>
  <head>
    <title>javaBean</title>
  </head>
  
  <body>
       <h1 algin="center">登錄成功</h1>
             <jsp:useBean id="user"  scope="request" class="com.User" />
             <jsp:setProperty property="name" name="user" param="userName"/>
             <jsp:setProperty property="password" name="user" 
param="password"/>
             <jsp:setProperty property="emali" name="user" param="emali"/>
             <jsp:setProperty property="phone" name="user" param="phone"/>
             登錄的使用者名稱為：  ${requestScope.user.name }
  </body>
</html>
