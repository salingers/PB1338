<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modify.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="/netbank/style/style.css">
	<link rel="stylesheet" type="text/css" href="/netbank/style/default.css">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function check()
	{
	
      	var isMobile=/^(?:13\d|15\d)\d{5}(\d{3}|\*{3})$/;   
       	var isPhone=/^((0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/; 
       	var isCardid=/^\d{17}(\d|x)$/;
		var username=document.getElementById("username").value;
		var pwd=document.getElementById("pwd").value;
		var confirmpwd=document.getElementById("confirmpwd").value;
		var balance=document.getElementById("balance").value;
		var realname=document.getElementById("realname").value;
		var age=document.getElementById("age").value;
		var address=document.getElementById("address").value;
		var telephone=document.getElementById("telephone").value;
		var cardid=document.getElementById("cardid").value;
		
		
		document.getElementById("errorusername").innerHTML="";
		document.getElementById("errorpwd").innerHTML="";
		document.getElementById("errorconfirmpwd").innerHTML="";
		document.getElementById("errorbalance").innerHTML="";
		document.getElementById("errorrealname").innerHTML="";
		document.getElementById("errorage").innerHTML="";
		document.getElementById("erroraddress").innerHTML="";
		document.getElementById("errortelephone").innerHTML="";
		document.getElementById("errorcardid").innerHTML="";
		if(username=="")
		{
				document.getElementById("errorusername").innerHTML="請輸入使用者名稱";
				return false;
		}else if(pwd=="")
		{
				document.getElementById("errorpwd").innerHTML="請輸入密碼";
				return false;
		}else if(confirmpwd=="")
		{
				document.getElementById("errorconfirmpwd").innerHTML="請確認密碼";
				return false;
		}else if(balance=="")
		{
				document.getElementById("errorbalance").innerHTML="請輸入金額";
				return false;
		}else if(realname=="")
		{
				document.getElementById("errorrealname").innerHTML="請輸入姓名";
				return false;
		}else if(address=="")
		{
				document.getElementById("erroraddress").innerHTML="請輸入位址";
				return false;
		}else if(telephone=="")
		{
				document.getElementById("errortelephone").innerHTML="請輸入電話";
				return false;
		}else if(cardid=="")
		{
				document.getElementById("errorcardid").innerHTML="請輸入身份證號";
				return false;
		}else if(age=="")
		{
				document.getElementById("errorage").innerHTML="請輸入年齡";
				return false;
		}else
		{
			if(pwd!=confirmpwd)
				{
					document.getElementById("errorconfirmpwd").innerHTML="兩次密碼不一致";
					return false;
				}
			if(!(balance.search(/^[\+\-]?\d+\.?\d*$/)==0))
			{
				
				document.getElementById("errorbalance").innerHTML="含有非法字元";
				return false;
			}else{
				if(parseFloat(balance)<10)
				{
						document.getElementById("errorbalance").innerHTML="開戶金額不能少於10元";
						return false;
				}
			}
			if(!(age.search(/^[\+\-]?\d+\.?\d*$/)==0))
			{
				
				document.getElementById("errorage").innerHTML="含有非法字元";
				return false;
			}else{
				if(parseFloat(age)<18)
				{
						document.getElementById("errorage").innerHTML="未成年人不能開戶";
						return false;
				}else if(parseFloat(age)>99)
				{
					document.getElementById("errorage").innerHTML="年齡輸入有誤,100歲以下";
						return false;
				}
			}
			if(!isPhone.test(telephone)&&!isMobile.test(telephone))
			{
				document.getElementById("errortelephone").innerHTML="電話格式不正確";
				return false;
			}
			if(!isCardid.test(cardid))
			{
				document.getElementById("errorcardid").innerHTML="身份證格式不正確";
				return false;
			}
			return true;
		}
		
		
		
	}
</script>
  </head>
  
  <body>
  <form method="post" name="myform" action="/netbank/admin/kaihu" onsubmit="return check()">
  <div align="center">
  	<table width="450" class="table">
			<tbody>
				<tr>
					<td width="100">使用者名稱：</td>
					<td>
						<input id="username" type="text" name="account.username"/>
						<span id="errorusername" style="color:red;">${message}</span>						
					</td>
				</tr>
				<tr>
					<td>密碼：</td>
					<td>
						<input id="pwd" type="password" name="account.password"/>
						<span id="errorpwd" style="color:red;"></span>
					</td>
				</tr>
				<tr>
					<td>確認密碼：</td>
					<td>
						<input id="confirmpwd" type="password"/>
						<span id="errorconfirmpwd" style="color:red;"></span>
					</td>
				</tr>
				<tr>
					<td>開戶金額：</td>
					<td>
						<input id="balance" type="text" name="account.balance" />
						<span id="errorbalance" style="color:red;"></span>
					</td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td>
						<input type="text" id="realname" name="personinfo.realname"/>
						<span id="errorrealname" style="color:red;"></span>
					</td>
				</tr>
				<tr>
					<td>年齡：</td>
					<td>
						<input id="age" type="text" name="personinfo.age""/>
						<span id="errorage" style="color:red;"></span>
					</td>
				</tr>
				<tr>
				<td>性別：</td>
				<td>
						<select name="personinfo.sex" >
							<option value="男" >男</option>
							<option value="女" >女</option>
						</select></td></tr> 
				<tr><td>家庭位址：</td>
				<td>
					<input id="address" type="text" name="personinfo.address""/>
					<span id="erroraddress" style="color:red;"></span>
				</td></tr>
				<tr>
					<td>聯繫電話：</td>
					<td>
						<input id="telephone" name="personinfo.telephone" value="${personinfo.telephone}" type="text"/>
						
						<font size="1">區號(3或4位)-電話(8或9位)</font>
						<span id="errortelephone" style="color:red;"></span>
					</td>
				</tr>
				<tr>
					<td>證件號碼：</td>
					<td>
					<input id="cardid" type="text" name="personinfo.cardid" value="${personinfo.cardid}"/>
					<font size="1" >15位或18位</font>
					<span id="errorcardid" style="color:red;"></span>
					</td>
				</tr>
				<tr>
				<td></td>
				<td><input type="submit" value="傳送" /> <br></td></tr>
			</tbody>
		</table>
		<div style="color:red;">
        <s:fielderror /> 
    	</div> 
		</div>
		<br>
  </form>  	
   </body>
</html>
