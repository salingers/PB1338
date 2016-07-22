package com.zxpm.biz.impl;

import java.util.List;
import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class GoodsBizImpl implements GoodsBiz {
    //�ϥ�GoodsDAO���f�ŧigoodsDAO����A�å[�Jset��k�Ω�̴ۨӤJ
	private GoodsDAO goodsDAO;		
	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

	//�[�J�ݩ�ӫ~
	public void addGoods(Goods goods) {
		goodsDAO.addGoods(goods);
	}	
	
	//���o�b��ӫ~�M��
	public List getOnSaleGoodsList() {
		Goods goods=new Goods();
		//���o���A��1���ӫ~�A����٥���X
		goods.setGoodsStatus(new Integer(1));
		List list=goodsDAO.search(goods);
		
		return list;
	}

	public List getGoodsById(int goodsId) {
	    return	goodsDAO.get(goodsId);
	}

	//�ھڱ�����o�ӫ~�M��
	public List getGoods(Goods condition) {		
		List list=goodsDAO.search(condition);
		return list;
	}

	public void updateGoods(Goods goods) {
		goodsDAO.updateGoods(goods);
		
	}

	//�ھڰӫ~�s�����o�ӫ~�T��
	public Goods getGoodsByGoodsId(int goodsId) {
		return goodsDAO.getGoodsByGoodsId(goodsId);	
	}	
}
