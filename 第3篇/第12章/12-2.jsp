<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
  <s:append var="app">
    <s:param value="{'java se','java web','java me','java ee'}"></s:param>
    <s:param value="{'c#','c++','vb'}"></s:param>
  </s:append>
  
  <table>
         <s:iterator value="#app" var="name" status="status">
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
