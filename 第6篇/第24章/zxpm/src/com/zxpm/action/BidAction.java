package com.zxpm.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.*;
import com.zxpm.entity.*;

public class BidAction extends ActionSupport implements RequestAware,SessionAware {
	//使用GoodsBiz宣告goodsBiz物件，並加入set方法用於相依植入
	GoodsBiz goodsBiz;	
	public void setGoodsBiz(GoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
	}
	//使用BidBiz宣告bidBiz物件，並加入set方法用於相依植入
	BidBiz bidBiz;
	public void setBidBiz(BidBiz bidBiz) {
		this.bidBiz = bidBiz;
	}	
	//使用UserBiz宣告userBiz物件，並加入set方法用於相依植入
	UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;	
	//宣告屬性myBidPrice，用於封裝表單參數
	private Float myBidPrice;	
	public Float getMyBidPrice() {
		return myBidPrice;
	}
	public void setMyBidPrice(Float myBidPrice) {
		this.myBidPrice = myBidPrice;
	}
	//宣告物件goods，用於封裝表單參數
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
	//宣告屬性bidId和buyerId，用於封裝使用者傳送的參數
	private int bidId;
	private int buyerId;	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getBidId() {
		return bidId;
	}
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	//傳送我的報價
	public String doSubmitBid(){
		//goods物件中封裝了出價頁面透過隱藏表單域傳遞的商品編號參數
		int goodsId=goods.getGoodsId().intValue();
		//根據商品編號取得商品訊息
   		Goods goods=goodsBiz.getGoodsByGoodsId(goodsId);
   		//從session中取出登入使用者物件，作為出價時商品的買家
   		Users buyer=(Users)session.get("user");	
   		//呼叫業務方法向資料表bid中寫入記錄
   		bidBiz.addBid(goods, buyer, myBidPrice);
		return "index";		
	}
	
	//成交
	public String doDeal(){
		//根據編號從資料表bid中取得出價記錄
   		Bid bid=bidBiz.getBid(bidId);
   		//根據關聯關系，從出價記錄中取得商品物件
   		Goods goods=bid.getGoods();
   		//成交後，將取得的出價記錄狀態設定位2
   		bid.setBidStatus(new Integer(2));
   		//將資料表bid中的出價記錄更新
   		bidBiz.updateBid(bid); 
   		//根據買家編號取得買家使用者物件
   		Users buyer=userBiz.getUsersById(buyerId); 
   		//將資料表Goods中的成交商品的狀態設定為2，表示該商品已成交
   		goods.setGoodsStatus(new Integer(2));
   		//設定資料表Goods中成交商品的買家
   		goods.setBuyer(buyer);
   		//更新資料Goods
   		goodsBiz.updateGoods(goods);
		return "index";
		
	}
}
