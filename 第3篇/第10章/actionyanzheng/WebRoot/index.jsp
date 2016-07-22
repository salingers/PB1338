<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>Struts2手動驗證</title>
	
  </head>
  
  <body>
  	<s:fielderror></s:fielderror>
    <s:form action="yanzheng.action" theme="simple">
		    使用者名稱:<s:textfield name="user" label=""></s:textfield><br/><br/>
		    性別框:<s:textfield name="sex" label=""></s:textfield><br/><br/>
		    密碼框:<s:password name="pass" label=""></s:password><br/><br/>
    	<s:submit value="傳送"></s:submit>
    </s:form>
  </body>
</html>
