package com.zxpm.biz.impl;
import java.util.Date;
import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class BidBizImpl implements BidBiz {

	//使用BidDAO接口宣告物件bidDAO，並加入set方法用於相依植入
	private BidDAO bidDAO;
	public void setBidDAO(BidDAO bidDAO) {
		this.bidDAO = bidDAO;
	}
	
	//加入出價記錄
	public void addBid(Goods goods, Users buyer, float myBidPrice) {
		//建立Bid類別物件
		Bid bid = new Bid();
		//設定出價記錄
		bid.setBidPrice(new Float(myBidPrice));
		//設定成交狀態為1
		bid.setBidStatus(new Integer(1));
		//設定出價時間
		bid.setBidTime(new Date());
		//設定出價記錄中商品的買家
		bid.setBuyer(buyer);
		//根據關聯關系，設定出價記錄中的商品編號
		bid.setGoods(goods);
		bidDAO.add(bid);
	}
	
	/*public Goods getGoodsByGoodsId(int goodsId) {
		return ibiddao.getGoodsByGoodsId(goodsId);		
	}*/
	
	public BidDAO getBidDAO() {
		return bidDAO;
	}

	/*public void updateGoods(Goods goods) {
		ibiddao.updateGoods(goods);
		
	}*/
	/*public void deal(int bidId) {
		Bid bid = this.ibiddao.get(bidId);
		bid.setBidStatus(new Integer(2));
		Goods goods = bid.getGoods();
		goods.setGoodsStatus(new Integer(2));
		this.ibiddao.updateGoods(goods);
		this.ibiddao.updateBid(bid);
	}*/
	
	//根據編號從資料表bid中取得出價記錄
	public Bid getBid(int bidId) {
		Bid bid=bidDAO.get(bidId);
		return bid;
	}
	
	//將資料表bid中的出價記錄更新
	public void updateBid(Bid bid) {
		bidDAO.updateBid(bid);		
	}	
}
