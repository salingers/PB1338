package com.zxpm.dao;

import com.zxpm.entity.Bid;

public interface BidDAO {
	//�V��ƪ�bid���[�J�X���O��
	public void add(Bid bid);
	
	//public Goods getGoodsByGoodsId(int goodsId);
	//public void updateGoods(Goods goods);
	
	//�ھڽs���q��ƪ�bid�����o�X���O��
	public Bid get(int bidId);
	
	//�N��ƪ�bid�����X���O����s
	public void updateBid(Bid bid);
}
