<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
   merge�Ҧ������� �G
   <s:merge var="merge">
      <s:param value="{'javase','javaweb'}"></s:param>
      <s:param value="{'javame','javaee'}"></s:param>
      <s:param value="{'c#','c++'}"></s:param>
   </s:merge>
   
  <table>
        <s:iterator value="#merge" var="name" status="status">
        <tr>
         <s:if test="#status.index%2==0"> 
<td style="background-color: red"><s:property value="name"/> </td>
</s:if>   
         <s:else > 
<td style="background-color: gray;"><s:property value="name"/> </td>
</s:else>   
        </tr>      
       </s:iterator>
      </table>
   append�Ҧ�������       
   <s:append var="append">
      <s:param value="{'javase','javaweb'}"></s:param>
      <s:param value="{'javame','javaee'}"></s:param>
      <s:param value="{'c#','c++'}"></s:param>
   </s:append>
    <table>
         <s:iterator value="#append" var="name" status="status">
        <tr>
         <s:if test="#status.index%2==0"> 
<td style="background-color: red"><s:property value="name"/> </td>
</s:if>   
         <s:else > 
<td style="background-color: gray;"><s:property value="name"/> </td>
</s:else>   
        </tr>      
       </s:iterator>
      </table>
  </body>
</html>
