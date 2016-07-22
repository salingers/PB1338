<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.apache.struts2.util.IteratorGenerator" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2¼ÐÃ±®w</title>
  </head>
  
  <body>
   <s:generator separator="," val="'javase,javaweb,javam,javaee'" var="java">
</s:generator>
  <%
    IteratorGenerator it =(IteratorGenerator)request.getAttribute("java");
       while(it.hasNext()){
    	   out.print(it.next());
    	   out.print("<br/>");
       }
  %>
  </body>
</html>
