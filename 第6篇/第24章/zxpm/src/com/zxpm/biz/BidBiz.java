package com.zxpm.biz;

import com.zxpm.entity.*;

public interface BidBiz {
	//加入出價記錄
	public void addBid(Goods goods,Users buyer,float myBidPrice);
	//public Goods getGoodsByGoodsId(int goodsId);
	//public void updateGoods(Goods goods);
	//public void deal(int id);
	
	//根據編號從資料表bid中取得出價記錄
	public Bid getBid(int bidId);
	
	//將資料表bid中的出價記錄更新
	public void updateBid(Bid bid);
}
