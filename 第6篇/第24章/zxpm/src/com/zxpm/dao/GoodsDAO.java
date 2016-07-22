package com.zxpm.dao;

import java.util.List;

import com.zxpm.entity.Goods;

public interface GoodsDAO {
	//加入待拍商品
	public void addGoods(Goods goods);
	
    //根據條件取得商品清單
	public List search(Goods condition);	
	
	public List get(int goodsId);
	
	public void updateGoods(Goods goods);
	
	//根據商品編號取得商品訊息
	public Goods getGoodsByGoodsId(int goodsId);
}
