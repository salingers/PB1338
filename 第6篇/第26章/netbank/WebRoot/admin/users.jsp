<%@page contentType="text/html;charset=utf-8" import="java.util.*"%>
<%@page import="com.netbank.entity.Admin"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
if(session.getAttribute("admin")==null)
{
		response.sendRedirect("login.jsp");

}
%>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"">
<link rel="stylesheet" type="text/css" href="../style/style.css">
<link rel="stylesheet" type="text/css" href="../style/default.css">
</head>
<body>
<div align="center"><center>
<!-- 查詢使用者表單部分 -->
<Form action="/netbank/admin/search" method="POST">
輸入要查詢使用者的真實姓名:
<input name="personinfo.realname"/>
<input name="status.id" type="hidden" value="${status.id}">  
&nbsp;&nbsp;&nbsp;<input type=submit value="傳送" ></input>
</FORM>
<table width="100%" height="73" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#999999" bgcolor="#999999">
        <!-- 使用者訊息顯示標頭部分 -->
        <tr>
          <td  height="20" nowrap  bgcolor="#999999">
            <div align="center"><font color="#FFFFFF">序列</font></div></td>
          <td nowrap bgcolor="#999999">
          	<div align="center"><font color="#FFFFFF">賬戶</font></div>
          </td>
           <td nowrap bgcolor="#999999">
          	<div align="center"><font color="#FFFFFF">使用者名稱</font></div>
          </td>
          <td  nowrap bgcolor="#808080">
            <div align="center">
            	<font color="#FFFFFF">賬戶余額</font>
            </div>
           </td> 
          <td  nowrap bgcolor="#808080">
            <div align="center">
            	<font color="#FFFFFF">姓名</font>
            </div>
           </td>                
          <td  nowrap bgcolor="#808080">
            <div align="center"><font color="#FFFFFF">詳細位址</font></div></td>
          <td  nowrap  bgcolor="#999999">
            <div align="center"><font color="#FFFFFF">身份證號</font></div></td>
          <td  nowrap  bgcolor="#808080">
            <div align="center"><font color="#FFFFFF">電話</font></div></td>
          <td  nowrap  bgcolor="#808080">
            <div align="center">
            	<font color="#FFFFFF">狀態</font>
            </div>
           </td>
           <td  nowrap  bgcolor="#808080">
            <div align="center">
            	<font color="#FFFFFF">動作</font>
            </div>
           </td>       
          <td nowrap  bgcolor="#999999">
          	<div align="center"><font color="#FFFFFF">&nbsp;</font>
          	</div>
          </td>	 
        </tr>
    <!-- 循環顯示使用者訊息部分 -->
	<s:iterator value="#request.users" status="status">
	  <tr bgcolor="#FFFFFF"> 
              <td  height="20" valign="middle"> 
                <div id="noWrap" align="center">
                <s:property value="#status.count"/>
                </div></td>
              <td valign="middle"> 
              <div id="noWrap" align="center">
              	<s:property value="account.accountid"/>
              </div></td>
              <td valign="middle"> 
              <div id="noWrap" align="center">
              	<s:property value="account.username"/>
              </div></td>
              <td  height="20" valign="middle"> 
               	<div id="noWrap" align="center">
               	 <s:property value="account.balance"/>
                </div>
               </td>
              <td  height="20" valign="middle"> 
                <div id="noWrap" align="center">
               	 <s:property value="realname"/>
                </div>
               </td>
              <td valign="middle"> 
                <div id="noWrap" align="center">
                	<s:property value="address"/>
                </div></td>
              <td valign="middle"> 
                <div id="noWrap" align="center">
                	<s:property value="cardid"/>
                </div></td>
              <td valign="middle"> 
                <div id="noWrap" align="center">
                	<s:property value="telephone"/>
                </div></td>
                <td valign="middle"> 
                <div id="noWrap" align="center">
                	<s:property value="account.status.name"/>
                </div></td>
                <td>
                <div id="noWrap" align="center">
                	<s:if test="account.status.name=='啟用'">
                	<input type="button" value="凍結" onclick="javascript:location.href='/netbank/admin/locking?id=${account.accountid}&status.id=${status.id}'">
                	</s:if>
					<s:else>
						<input type="button" value="啟用" onclick="javascript:location.href='/netbank/admin/enabled?id=${account.accountid}&status.id=${status.id}'">
					</s:else>
                </div></td>
     	      <td valign="middle"> 
                <div id="noWrap" align="center"><A href="/netbank/admin/del?id=${account.accountid}&status.id=${status.id}">&nbsp;移除&nbsp;</a></div></td></tr>  
	          </s:iterator>
            <tr> 
              <td height="20" colspan="14" valign="middle"> 
                </div></td>              
            </tr>
 	</table>
  	</center>
	</div>
	</body>
	</html>
	