package com.zxpm.biz;

import com.zxpm.entity.*;

public interface BidBiz {
	//�[�J�X���O��
	public void addBid(Goods goods,Users buyer,float myBidPrice);
	//public Goods getGoodsByGoodsId(int goodsId);
	//public void updateGoods(Goods goods);
	//public void deal(int id);
	
	//�ھڽs���q��ƪ�bid�����o�X���O��
	public Bid getBid(int bidId);
	
	//�N��ƪ�bid�����X���O����s
	public void updateBid(Bid bid);
}
