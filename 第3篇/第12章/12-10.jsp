<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2標簽庫</title>
  </head>
  
  <body>
           <h1>使用url標簽產生的url</h1>
           <s:url  action="index" includeParams="get" namespace="/" >
             <s:param name="name" value="zhangsan"></s:param>
           </s:url>
  </body>
</html>
