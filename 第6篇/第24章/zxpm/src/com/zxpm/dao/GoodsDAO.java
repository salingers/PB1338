package com.zxpm.dao;

import java.util.List;

import com.zxpm.entity.Goods;

public interface GoodsDAO {
	//�[�J�ݩ�ӫ~
	public void addGoods(Goods goods);
	
    //�ھڱ�����o�ӫ~�M��
	public List search(Goods condition);	
	
	public List get(int goodsId);
	
	public void updateGoods(Goods goods);
	
	//�ھڰӫ~�s�����o�ӫ~�T��
	public Goods getGoodsByGoodsId(int goodsId);
}
