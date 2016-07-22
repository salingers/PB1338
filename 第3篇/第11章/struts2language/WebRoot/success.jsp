<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  		<title><s:text name="login.success"/></title>
  </head>
  
  <body>
    <%=request.getAttribute("userName")%>:<s:text name="login.welcome"/>
  </body>
</html>
