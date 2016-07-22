<%@page contentType="text/html;charset=UTF-8" import="java.sql.*,java.util.*"%>

<%
if(session.getAttribute("user")!=null){
//--------------------------------------logged------------------------------------------------------------------
	
%>
<html>
<head>
<title>管理頁面</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
<link rel="stylesheet" type="text/css" href="style/default.css">

</head>
<BODY>

<table cellpadding=0 cellspacing=0 width=200 align=center class="table">

  <tr>
        <td height=25 align="center" bgcolor="#DBC2B0"> 
          <b>使用者管理</b></td>
  </tr>
  <tr>
    <td>
            <table cellpadding=0 cellspacing=0 align=center width=180 class="table" >                           
              <tr> 
                <td height=20><a href=/netbank/deposit.jsp target=right >存款</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/withdrawal.jsp target=right>取款</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/transfer.jsp target=right>轉賬</a></td>
              </tr>
               <tr> 
                <td height=20><a href=/netbank/transaction/list?pager.curPage=1 target=right>查詢交易記錄</a></td>
              </tr>
               <tr> 
                <td height=20><a href=/netbank/information.jsp target=right>檢視訊息</a></td>
              </tr>
               <tr> 
                <td height=20><a href=/netbank/modify.jsp target=right>修改個人訊息</a></td>
              </tr>
               <tr> 
                <td height=20><a href=/netbank/changepwd.jsp target=right>修改密碼</a></td>
              </tr>
               <tr> 
                <td height=20 ><a href=/netbank/user/user_logout target=_top>登出</a></td>
              </tr>
              </table>
	</td>
  </tr>
</table>
<%
}
%>