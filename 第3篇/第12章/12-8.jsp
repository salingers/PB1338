<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
           <s:bean name="com.struts.Person" var="per">
             <s:param name="name" value="'�i�T'"></s:param>
             <s:param name="sex" value="'�k'"></s:param>
           </s:bean>
           
           <s:push value="#per">
           �m�W�G<s:property value="name"/><br/>
           �ʧO�G<s:property value="sex"/>
           </s:push>
  </body>
</html>
