<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>Struts2¼ÐÃ±®w</title>
  </head>
  
  <body>
   <s:subset source="{'java','c','c++','c#','vb'}" var="subset" 
start="1" count="3" id="sub">
    <table>
        <s:iterator  status="status" >
        <tr>
         <s:if test="#status.index%2==0"> 
<td style="background-color: red"><s:property /> </td>
</s:if>   
         <s:else > 
<td style="background-color: gray;"><s:property /> </td>
</s:else>   
        </tr>      
         </s:iterator>
         </table>
    </s:subset>
  </body>
</html>
