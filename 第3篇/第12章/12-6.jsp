<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
         <%
             Date date = new Date(110,7,18);
             request.setAttribute("time",date);
         %>
         
       �S�����wnice�ݩʡA���w�Fformat�ݩʡG  
       <s:date name="#request.time" format="dd/MM/yyyy"/><br/>
       �S�����wformat �ݩʡA���w�Fnice�ݩʡG      
       <s:date name="#request.time" nice="true"/><br/>
       �Y���w�Fnice�ݩʤS���w�Fformat�ݩʡG    
       <s:date name="#request.time" format="dd/MM/yyyy" nice="true"/><br/>
  </body>
</html>
