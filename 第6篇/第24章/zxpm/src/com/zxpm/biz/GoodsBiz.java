package com.zxpm.biz;

import java.util.List;
import com.zxpm.entity.Goods;

public interface GoodsBiz {
	//�[�J�ݩ�ӫ~
	public void addGoods(Goods goods);
	
	//���o�b��ӫ~�M��
	public List getOnSaleGoodsList();	
	
	//�ھڰӫ~�s�����o�ӫ~�T��
	public Goods getGoodsByGoodsId(int goodsId);
	
	public List getGoodsById(int goodsId);
	
	//�ھڱ�����o�ӫ~�M��
	public List getGoods(Goods condition);
	
	public void updateGoods(Goods goods);
	
}
