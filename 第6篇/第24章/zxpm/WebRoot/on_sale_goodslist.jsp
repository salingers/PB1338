<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<link href="/zxpm/style/mycss.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/texts.css" rel="stylesheet" type="text/css" />
<link href="/zxpm/style/btn.css" rel="stylesheet" type="text/css" />
<style>
.table_title{
border:solid 1px #aaa;
border-width:0 0 1px 0;
}
</style>


<script>

function SwitchDisplay(oid){
	var o = document.getElementById(oid);
	if (o){
		if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
	}
}
</script>
  <logic:present scope="request" name="onSaleGoodsList">  
   <table border="0">
   <s:iterator id="goods" value="#request.onSaleGoodsList">
	  <tr><td>	 
	    <!-- 顯示在拍商品訊息 --> 
		<div class="goods_pic"><img src="/zxpm/${goods.goodsPic}" title="${goods.goodsDesc}" style="width:100px;border:dashed 1px green;"></img></div></td>
		<td valign="top"><div class="goods_info" style="border:solid 0px blue;">
			<span class="info_title">商品名稱</span>&nbsp;<strong>${goods.goodsName}</strong><br />
			<span class="info_title">賣  &nbsp;&nbsp;   家</span>&nbsp;<em>${goods.saler.userName}</em> <br />
			<span class="info_title">起 拍 價</span>&nbsp;<span style="color:green;">${goods.goodsPrice}</span><br />
			<!-- 若果使用者已經登入，且不是該商品的賣家，則在該商品旁顯示“出價”按鈕 -->
			<logic:notEmpty name="user" scope="session">					
				<logic:notEqual name="goods" property="saler.userId" value="${sessionScope.user.userId}">
					<a class="a_button" href="/zxpm/goods/doBid?goods.goodsId=${goods.goodsId}"><font color="red">我要出價</font></a>
				</logic:notEqual>
			</logic:notEmpty>	
		</div>
		</td>	
	  </tr>	
	 <!-- 在每個商品下顯示出價記錄 -->
	 <logic:notEmpty name="goods" property="bids">
	  <tr valign="top"><td>出價記錄：<br>
	       <s:iterator id="b" value="#goods.bids">			
				<em><s:property value="buyer.userName"/> </em>	
				<s:date name="#b.bidTime" format="yyyy-MM-dd hh:mm"/>	
				<span style="color:green;font-weight:bold;"><s:property value="bidPrice"/></span><br />
			</s:iterator>
		</td>
	  </tr>	  
	 </logic:notEmpty>	
	</s:iterator>
   </table>	
  </logic:present>			
  