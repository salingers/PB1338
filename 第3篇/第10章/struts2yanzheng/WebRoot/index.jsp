<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>���struts2���Үج[����</title>
  </head>
  
  <body>
  		<s:form action="yanzheng">
  			<s:textfield name="user" label="�ϥΪ�"></s:textfield>
  			<s:password name="pass" label="�K�X"></s:password>
  			<s:submit value="�ǰe"></s:submit>
  		</s:form>
  </body>
</html>
