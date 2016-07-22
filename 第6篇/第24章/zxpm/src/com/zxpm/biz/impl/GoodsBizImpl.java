package com.zxpm.biz.impl;

import java.util.List;
import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class GoodsBizImpl implements GoodsBiz {
    //使用GoodsDAO接口宣告goodsDAO物件，並加入set方法用於相依植入
	private GoodsDAO goodsDAO;		
	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

	//加入待拍商品
	public void addGoods(Goods goods) {
		goodsDAO.addGoods(goods);
	}	
	
	//取得在拍商品清單
	public List getOnSaleGoodsList() {
		Goods goods=new Goods();
		//取得狀態為1的商品，表示還未拍出
		goods.setGoodsStatus(new Integer(1));
		List list=goodsDAO.search(goods);
		
		return list;
	}

	public List getGoodsById(int goodsId) {
	    return	goodsDAO.get(goodsId);
	}

	//根據條件取得商品清單
	public List getGoods(Goods condition) {		
		List list=goodsDAO.search(condition);
		return list;
	}

	public void updateGoods(Goods goods) {
		goodsDAO.updateGoods(goods);
		
	}

	//根據商品編號取得商品訊息
	public Goods getGoodsByGoodsId(int goodsId) {
		return goodsDAO.getGoodsByGoodsId(goodsId);	
	}	
}
