<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>登錄</title>
  </head>
  
  <body>
  <center><h1>登錄頁面</h1></center>
<form id="form1" name="form1" method="post" action="">
  <table width="274" height="292" border="1" align="center">
    <tr>
      <td width="108">帳號：</td>
      <td width="150"><label for="textfield2"></label>
      <input type="text" name="userName" id="textfield2" /></td>
    </tr>
    <tr>
      <td>密碼：</td>
      <td><label for="textfield3"></label>
      <input type="password" name="password" id="textfield3" /></td>
    </tr>
    <tr>
      <td>重復密碼：</td>
      <td><label for="textfield4"></label>
      <input type="password" name="confirmPassword" id="textfield4" /></td>
    </tr>
    <tr>
      <td>emali：</td>
      <td><label for="textfield5"></label>
      <input type="text" name="emali" id="textfield5" /></td>
    </tr>
    <tr>
      <td>電話：</td>
      <td><label for="textfield6"></label>
      <input type="text" name="number" id="textfield6" /></td>
    </tr>
    <tr>
      <td colspan="2"><label for="textfield7"></label>
      <input type="submit" name="button" id="button" value="傳送" /></td>
    </tr>
  </table>
</form>
</body> 
</html>
