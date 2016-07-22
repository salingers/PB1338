<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2標簽庫</title>
  </head>
  
  <body>
        <h1>一下是被包括的頁面</h1>
        <!-- 用include標簽來包括其他頁面 -->
        <s:include value="include.jsp"> </s:include>
  </body>
</html>
