<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>Struts2�������</title>
	
  </head>
  
  <body>
  	<s:fielderror></s:fielderror>
    <s:form action="yanzheng.action" theme="simple">
		    �ϥΪ̦W��:<s:textfield name="user" label=""></s:textfield><br/><br/>
		    �ʧO��:<s:textfield name="sex" label=""></s:textfield><br/><br/>
		    �K�X��:<s:password name="pass" label=""></s:password><br/><br/>
    	<s:submit value="�ǰe"></s:submit>
    </s:form>
  </body>
</html>
