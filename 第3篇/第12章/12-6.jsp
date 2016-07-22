<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2標簽庫</title>
  </head>
  
  <body>
         <%
             Date date = new Date(110,7,18);
             request.setAttribute("time",date);
         %>
         
       沒有指定nice屬性，指定了format屬性：  
       <s:date name="#request.time" format="dd/MM/yyyy"/><br/>
       沒有指定format 屬性，指定了nice屬性：      
       <s:date name="#request.time" nice="true"/><br/>
       即指定了nice屬性又指定了format屬性：    
       <s:date name="#request.time" format="dd/MM/yyyy" nice="true"/><br/>
  </body>
</html>
