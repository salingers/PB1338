<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.zxpm.entity.Users;"%>
<script language="javascript">
<!--
	function login(){
		if( document.f1.userName.value =="" ){
			alert("使用者名稱不能為空");
			return false;
		}else if(document.f1.password.value == ""){
			alert("密碼不能為空");
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
		<td width=''><font color='red'>目前使用者：
<%
			Users user = (Users) session.getAttribute("user");
%>
			<%=user.getUserName()%></font>
		</td>
	</tr>
	
	<tr>
		<td width='100'><a href="/zxpm/upload.jsp">加入商品</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/goods/toMyGoods">管理我的商品</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/edit_pwd.jsp">[修改密碼]</a></td>
	</tr>
	<tr>
		<td width='100'><a href="/zxpm/user/loginout">[登出]</a></td>
	</tr>
	</table>
<%
} else {
%>
	<form name="f1" action="/zxpm/user/doLogin" method="post" onsubmit="return login();">
	  <table align="center">
		<tr>
			<td colspan="2">使用者名稱：</td>
		</tr>
		<tr>
		  <td colspan="2"><input type="text" name="users.userName" size=10" class="editbox"></td>
		</tr>
		<tr>
			<td colspan="2">密&nbsp;&nbsp;碼：</td>
			</tr>
		<tr>
		  <td colspan="2"><input type="password" name="users.password" size=10"  class='editbox'></td>
		  </tr>
		<tr>
			<td>				
				<input type="submit" value="登入" class='btn'>
				<input type="reset" value="重設" class='btn'>
			</td>
		</tr>
		<tr>
		  <td><a href="/zxpm/reg.jsp">登錄使用者</a></td>
		</tr>
		<tr>
		<td width='100'><a href="/zxpm/index.jsp">傳回首頁</a></td>
	</tr>
	  </table>
   </form>
<%
}
%>