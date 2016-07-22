<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2標簽庫</title>
  </head>
  
  <body>
           <s:bean name="com.struts.Person" var="per">
             <s:param name="name" value="'張三'"></s:param>
             <s:param name="sex" value="'男'"></s:param>
           </s:bean>
           
           <s:push value="#per">
           姓名：<s:property value="name"/><br/>
           性別：<s:property value="sex"/>
           </s:push>
  </body>
</html>
