<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>包範圍資源檔案測試</title>
  </head>
  
  <body>
  		<s:form action="otherresource">
  		 	<s:textfield name="user" label="使用者名稱"></s:textfield>
  		 	<s:submit value="傳送"></s:submit>
  		</s:form>
  </body>
</html>
