<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'showRegInfo.jsp'page</title>
<style>
		.content {font-size:12px;}
	</style>
  </head>
  <body>
	   <table class="content">
	   		<tr>
	   			<td align="center">登錄的訊息如下：</td>
	   		</tr>
		  	<tr>
		  		<td>姓名:<s:property value="name"/></td>
		  	</tr>
		  	<tr>
		  		<td>年齡:<s:property value="age"/></td>
		  	</tr>
		  	<tr>
		  		<td>體重:<s:property value="weight"/></td>
		  	</tr>
		  	<tr>
		  		<td>性別:<s:property value="sex"/></td>
		  	</tr>
		  	<tr>
		  		<td>職位:<s:property value="position"/></td>
		  	</tr>
		  	<tr>
		  		<td>隱藏id:<s:property value="id"/></td>
		  	</tr>			
	  	</table>
  </body>
</html>
