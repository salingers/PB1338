package com.zxpm.biz;

import java.util.List;
import com.zxpm.entity.Goods;

public interface GoodsBiz {
	//加入待拍商品
	public void addGoods(Goods goods);
	
	//取得在拍商品清單
	public List getOnSaleGoodsList();	
	
	//根據商品編號取得商品訊息
	public Goods getGoodsByGoodsId(int goodsId);
	
	public List getGoodsById(int goodsId);
	
	//根據條件取得商品清單
	public List getGoods(Goods condition);
	
	public void updateGoods(Goods goods);
	
}
