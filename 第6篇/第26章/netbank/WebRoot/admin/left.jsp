<%@page contentType="text/html;charset=utf-8" import="java.sql.*,java.util.*"%>
<%
if(session.getAttribute("admin")!=null){
//--------------------------------------logged------------------------------------------------------------------
	
%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../style/style.css">
<link rel="stylesheet" type="text/css" href="../style/default.css">
</head>
<BODY leftmargin="20" topmargin="0" marginheight="0" marginwidth="0">


<table cellpadding=0 cellspacing=0 width=200 align=center>

  <tr>
        <td height=25 align="center" bgcolor="#DBC2B0"> 
          <b>背景管理</b></td>
  </tr>
  <tr>
    <td bgcolor="#F5EFE7">
            <table cellpadding=0 cellspacing=0 align=center width=200>    
            	<tr> 
                <td height=20><a href=/netbank/admin/listUsers?status.id=0 target=right>所有賬戶</a></td>
              </tr> 
              <tr> 
                <td height=20><a href=/netbank/admin/listUsers?status.id=2 target=right>已凍結賬戶</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/admin/listUsers?status.id=1 target=right>已啟用賬戶</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/admin/add.jsp target=right>開戶</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/admin/changepwd.jsp target=right>修改個人密碼</a></td>
              </tr>
              <tr> 
                <td height=20><a href=/netbank/admin/logout target=_top>登出</a></td>
              </tr>
              </table>
	</td>
  </tr>
</table>










	</td>
  </tr>
</table>
<%
}
else{//------------------------------------not logged-------------------------------------------------------
response.sendRedirect("index.jsp");
}
%>