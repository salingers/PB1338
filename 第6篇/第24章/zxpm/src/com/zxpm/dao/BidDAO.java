package com.zxpm.dao;

import com.zxpm.entity.Bid;

public interface BidDAO {
	//向資料表bid中加入出價記錄
	public void add(Bid bid);
	
	//public Goods getGoodsByGoodsId(int goodsId);
	//public void updateGoods(Goods goods);
	
	//根據編號從資料表bid中取得出價記錄
	public Bid get(int bidId);
	
	//將資料表bid中的出價記錄更新
	public void updateBid(Bid bid);
}
