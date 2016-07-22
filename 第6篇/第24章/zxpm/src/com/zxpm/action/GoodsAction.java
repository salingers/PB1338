package com.zxpm.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.GoodsBiz;
import com.zxpm.entity.*;

public class GoodsAction extends ActionSupport implements RequestAware,SessionAware {
	//使用GoodsBiz宣告goodsBiz物件，並加入set方法用於相依植入
	GoodsBiz goodsBiz;
	public void setGoodsBiz(GoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;
	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
	//使用Goods實體類別宣告屬性goods，用於封裝參數
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	//在拍商品清單
	public String toOnSaleGoodsList(){
		List onSaleGoodsList=goodsBiz.getOnSaleGoodsList();
		request.put("onSaleGoodsList", onSaleGoodsList);
		return "onSaleGoodsList";
	}
	
	
	/*public void validateToOnSaleGoodsList() {
		this.clearErrorsAndMessages();
    }*/
	
	//我發布的在拍商品清單
	public String toMyGoods(){
		Goods goods=new Goods();
		//從session中取出商品的賣家
		Users saler=(Users)session.get("user");
		goods.setSaler(saler);
		//要求商品狀態為1，表示該商品未拍出
		goods.setGoodsStatus(new Integer(1));
		//根據指定條件查詢商品訊息，即商品賣家為登入使用者的商品清單
		List mygoodslist=goodsBiz.getGoods(goods);
		request.put("mygoodslist", mygoodslist);
		return "mygoods";
	}
	
	//我要出價
	public String doBid(){
		//從goods物件中取得透過查詢字串傳遞的商品編號
		int goodsId=goods.getGoodsId();		
		//根據商品編號取得商品訊息並儲存,以便在出價頁面顯示
		Goods g=goodsBiz.getGoodsByGoodsId(goodsId);
		request.put("g", g);
		//頁面跳躍到goods_bid.jsp
		return "goodsbid";
	}
	
    //加入在拍商品
	public String toAddGoodsInfo(){
		//從session中取得上傳檔案的相對路徑
		String filepath=(String)session.get("filepath");
		goods.setGoodsPic(filepath);		
		Users saler=(Users)session.get("user");
		goods.setGoodsStatus(new Integer(1));
		//新加入的在拍商品，買家和賣家相同
	    goods.setSaler(saler);
	    goods.setBuyer(saler);
	    goodsBiz.addGoods(goods);
		return "index";		
	}
}
