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
	   			<td align="center">�n�����T���p�U�G</td>
	   		</tr>
		  	<tr>
		  		<td>�m�W:<s:property value="name"/></td>
		  	</tr>
		  	<tr>
		  		<td>�~��:<s:property value="age"/></td>
		  	</tr>
		  	<tr>
		  		<td>�魫:<s:property value="weight"/></td>
		  	</tr>
		  	<tr>
		  		<td>�ʧO:<s:property value="sex"/></td>
		  	</tr>
		  	<tr>
		  		<td>¾��:<s:property value="position"/></td>
		  	</tr>
		  	<tr>
		  		<td>����id:<s:property value="id"/></td>
		  	</tr>			
	  	</table>
  </body>
</html>
