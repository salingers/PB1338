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
	    <!-- ��ܦb��ӫ~�T�� --> 
		<div class="goods_pic"><img src="/zxpm/${goods.goodsPic}" title="${goods.goodsDesc}" style="width:100px;border:dashed 1px green;"></img></div></td>
		<td valign="top"><div class="goods_info" style="border:solid 0px blue;">
			<span class="info_title">�ӫ~�W��</span>&nbsp;<strong>${goods.goodsName}</strong><br />
			<span class="info_title">��  &nbsp;&nbsp;   �a</span>&nbsp;<em>${goods.saler.userName}</em> <br />
			<span class="info_title">�_ �� ��</span>&nbsp;<span style="color:green;">${goods.goodsPrice}</span><br />
			<!-- �Y�G�ϥΪ̤w�g�n�J�A�B���O�Ӱӫ~����a�A�h�b�Ӱӫ~����ܡ��X�������s -->
			<logic:notEmpty name="user" scope="session">					
				<logic:notEqual name="goods" property="saler.userId" value="${sessionScope.user.userId}">
					<a class="a_button" href="/zxpm/goods/doBid?goods.goodsId=${goods.goodsId}"><font color="red">�ڭn�X��</font></a>
				</logic:notEqual>
			</logic:notEmpty>	
		</div>
		</td>	
	  </tr>	
	 <!-- �b�C�Ӱӫ~�U��ܥX���O�� -->
	 <logic:notEmpty name="goods" property="bids">
	  <tr valign="top"><td>�X���O���G<br>
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
  