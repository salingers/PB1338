<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.zxpm.entity.Users;"%>
<script language="javascript">
<!--
	function login(){
		if( document.f1.userName.value =="" ){
			alert("�ϥΪ̦W�٤��ର��");
			return false;
		}else if(document.f1.password.value == ""){
			alert("�K�X���ର��");
			return false;
		} else {
			return true;
		}
	}
-->
</script>
<%
if (session.getAttribute("user") != null) {
%>
	<table align="center">
	<tr>
		<td width=''><font color='red'>�ثe�ϥΪ̡G
<%
			Users user = (Users) session.getAttribute("user");
%>
			<%=user.getUserName()%></font>
		</td>
	</tr>
	
	<tr>
		<td width='100'><a href="/zxpm/upload.jsp">�[�J�ӫ~</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/goods/toMyGoods">�޲z�ڪ��ӫ~</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/edit_pwd.jsp">[�ק�K�X]</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/user/loginout">[�n�X]</a></td>
	</tr>
	</table>
<%
} else {
%>
	<form name="f1" action="/zxpm/user/doLogin" method="post" onsubmit="return login();">
	  <table align="center">
		<tr>
			<td colspan="2">�ϥΪ̦W�١G</td>
		</tr>
		<tr>
		  <td colspan="2"><input type="text" name="users.userName" size=10" class="editbox"></td>
		</tr>
		<tr>
			<td colspan="2">�K&nbsp;&nbsp;�X�G</td>
			</tr>
		<tr>
		  <td colspan="2"><input type="password" name="users.password" size=10"  class='editbox'></td>
		  </tr>
		<tr>
			<td>				
				<input type="submit" value="�n�J" class='btn'>
				<input type="reset" value="���]" class='btn'>
			</td>
		</tr>
		<tr>
		  <td><a href="/zxpm/reg.jsp">�n���ϥΪ�</a></td>
		</tr>
		<tr>
		<td width='100'><a href="/zxpm/index.jsp">�Ǧ^����</a></td>
	</tr>
	  </table>
   </form>
<%
}
%>