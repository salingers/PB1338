<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
 <html> 
	<head>
		<title>轉賬頁面</title>
	</head>
	<body>
	   <s:form action="doTransfer.action">
	     <table align="center">
	       <tr>	       
	        <s:textfield name="ac1" label="賬戶1"  /> 
	       </tr>
	       <tr>
	         <s:textfield name="ac2" label="賬戶2"  /> 
	       </tr>
	       <tr>
	         <s:textfield name="amount" label="轉賬金額"  /> 
	       </tr>
	       <tr>
	         <s:submit value="轉賬"  /> 
	       </tr>	     
	     </table>
	   </s:form>
		
	</body>
</html>
