<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<HTML>
<HEAD>
<TITLE>線上商品拍賣網</TITLE>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

<link href="/zxpm/style/mycss.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/texts.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/btn.css" rel="stylesheet" type="text/css" />
<style>
.table_title{
border:solid 1px #aaa;
border-width:0 0 1px 0;
}
</style>
</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 valign="top">

<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="5"><img src="/zxpm/images/top.jpg" width="780" height="213"></td>
  </tr>
  <tr>
    <td colspan="5"><img src="/zxpm/images/middle1.jpg" width="780" height="47"></td>
  </tr>
  <tr>
    <td width="38" background="/zxpm/images/middle2.jpg">&nbsp;</td>
    <td width="172" valign="top"><%@ include file="in.jsp"%></td>
    <td width="35" background="/zxpm/images/layout_24.gif">&nbsp;</td>
    <td width="495">
	<table width="479" height="287" style="height: 287px;">
		<tr>
			<td width="3%">&nbsp;</td>
			<td width="97%">
<script>
function fswitch(id){
	var o = document.getElementById(id);
	if (o){
		if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
	}
}

function setGoodsPic(url){
	var oImg = document.getElementById("goodsUrl");
	oImg.src = url;
	oImg.style.width = "100px";
	oImg.style.height = "80";
}
</script>
   <logic:present scope="request" name="mygoodslist">
   <table border="0">
    <s:iterator id="goods" value="#request.mygoodslist">	
	  <tr><td>
	    <!-- 顯示我的在拍商品訊息 -->
		<div class="goods_pic"><img src="/zxpm/${goods.goodsPic}" title="${goods.goodsDesc}" style="width:100px;border:dashed 1px green;"></img></div></td>
		<td valign="top"><div class="goods_info" style="border:solid 0px blue;">
			<span class="info_title">商品名稱</span>&nbsp;<strong>${goods.goodsName}</strong><br />
			<span class="info_title">賣  &nbsp;&nbsp;   家</span>&nbsp;<em>${goods.saler.userName}</em> <br />
			<span class="info_title">起 拍 價</span>&nbsp;<span style="color:green;">${goods.goodsPrice}</span><br />				
		</div>
		</td>	
	  </tr>	
	 <!-- 在每個商品下顯示出價記錄 -->
	 <logic:notEmpty name="goods" property="bids">
	  <tr valign="top"><td>出價記錄：<br>
	        <s:iterator id="b" value="#goods.bids">
				<em>${b.buyer.userName}</em>
				<s:date name="#b.bidTime" format="yyyy-MM-dd hh:mm"/>				
				<span style="color:green;font-weight:bold;">${b.bidPrice}</span>
				<logic:notEqual name="b" property="bidStatus" value="2">
				<a class="a_button" href="/zxpm/bid/doDeal?bidId=${b.bidId}&buyerId=${b.buyer.userId}">
				<font color="red">成交</font></a>
				</logic:notEqual><br />
			</s:iterator>
		</td>
	  </tr>	  
	 </logic:notEmpty>
	</s:iterator>
   </table>	
  </logic:present>
  		<logic:empty scope="request" name="mygoodslist">
  		   您目前沒有拍賣商品！
  		</logic:empty>	
			</td>
		</tr>
		<tr>
			<td colspan="2"></td>
		</tr>
	</table>
	</td>
    <td width="40" background="/zxpm/images/middle4.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5"><img src="/zxpm/images/bottom.jpg" width="780" height="82"></td>
  </tr>
</table>
<P align="center">版權所有</P>
<br/>

</BODY>
</HTML>