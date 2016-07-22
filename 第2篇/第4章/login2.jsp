<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>login</title>
  </head>
  
  <body>
      <h1 algin=center>登入頁面</h1>
<form id="form1" name="form1" method="post" action="">
      <table width="458" height="239" border="1" align="center">
    <tr>
      <td width="84">帳號：</td>
      <td width="367"><label for="textfield8"></label>
      <input type="text" name="userName" id="textfield8" /></td>
    </tr>
    <tr>
      <td>密碼：</td>
      <td><input type="text" name="password" id="textfield" /></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" name="button" id="button" value="傳送" /></td>
    </tr>
  </table>
</form>                   
  </body>
</html>
