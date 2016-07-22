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
    
    <title>賬戶訊息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="style/style.css">
	<link rel="stylesheet" type="text/css" href="style/default.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	<%@ include file='checklogin.jsp' %>
	-->
	
	<script type="text/javascript">
		function select(){
			var curPage=document.getElementById("curPage").value;
			location.href="/netbank/transaction/list?pager.curPage="+curPage;
		}
	</script>
	</head>
  
  <body ><br>
  <div  align="center">       
	<table width="450" border="1" class="table">
		<tbody align="center">
		    <!--標題部分  -->
			<tr>
			<td colspan="5" style="font-size: 20;">交易記錄</td></tr>
			<tr ><td width="50">&nbsp;序號</td>
			<td width="80">&nbsp;對方賬戶</td>
			<td width="80">&nbsp;交易金額</td>
			<td width="80">&nbsp;交類別型態</td>
			<td>&nbsp;交易日期</td></tr>
			<!--循環顯示記錄部分  -->
			<s:iterator value="#request.logs" status="status" >
			<tr>
			<td>&nbsp;<s:property value="#status.count"/></td>			
			<s:if test="otherid==#session.user.accountid&&transactionType.name!='取款'">
				<td>&nbsp;<s:property value="account.accountid"/></td>
				<td>&nbsp;<s:property value="trMoney"/></td>
			</s:if>
			<s:else>
				<td>&nbsp;<s:property value="otherid"/></td>
				<td>&nbsp;-<s:property value="trMoney"/></td>				
			</s:else>
			<td><s:property value="transactionType.name"/></td>
			<td>&nbsp;<s:property value="datetime"/></td></tr>
			</s:iterator>				
		</tbody>
	</table>
	<!-- 分頁超連結部分 -->
	<table>
	  <tr >
		<td width="130"></td>
		<td width="80">
			<s:if test="pager.curPage>1">
				<A href='/netbank/transaction/list?pager.curPage=1'>首頁</A>&nbsp;&nbsp;
				<A href='/netbank/transaction/list?pager.curPage=${pager.curPage-1 }'>上一頁</A>
			</s:if>
		</td>
		<td width="80">
			<s:if test="pager.curPage < pager.pageCount">
				<A href='/netbank/transaction/list?pager.curPage=${pager.curPage+1}'>下一頁</A>&nbsp;&nbsp;
				<A href='/netbank/transaction/list?pager.curPage=${pager.pageCount }'>尾頁</A>
			</s:if>
		</td>
		<td>共${pager.curPage}/${pager.pageCount}頁&nbsp;&nbsp;
			轉至	<select onchange="select()" id="curPage">
			<s:iterator begin="1" end="pager.pageCount" status="status" >
				<s:if test="#status.count==pager.curPage">
					<option value="${status.count}" selected="selected">${status.count }</option>
				</s:if>
				<s:else>
					<option value="${status.count }">${status.count } </option>
				</s:else>
			</s:iterator>
		</select>頁	
		</td>
	  </tr>
	</table>
	</div>
  </body>
</html>
