<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
           <h1>�ϥ�url��ñ���ͪ�url</h1>
           <s:url  action="index" includeParams="get" namespace="/" >
             <s:param name="name" value="zhangsan"></s:param>
           </s:url>
  </body>
</html>
