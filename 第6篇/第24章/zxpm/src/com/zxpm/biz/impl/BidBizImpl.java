package com.zxpm.biz.impl;
import java.util.Date;
import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class BidBizImpl implements BidBiz {

	//�ϥ�BidDAO���f�ŧi����bidDAO�A�å[�Jset��k�Ω�̴ۨӤJ
	private BidDAO bidDAO;
	public void setBidDAO(BidDAO bidDAO) {
		this.bidDAO = bidDAO;
	}
	
	//�[�J�X���O��
	public void addBid(Goods goods, Users buyer, float myBidPrice) {
		//�إ�Bid���O����
		Bid bid = new Bid();
		//�]�w�X���O��
		bid.setBidPrice(new Float(myBidPrice));
		//�]�w���檬�A��1
		bid.setBidStatus(new Integer(1));
		//�]�w�X���ɶ�
		bid.setBidTime(new Date());
		//�]�w�X���O�����ӫ~���R�a
		bid.setBuyer(buyer);
		//�ھ����p���t�A�]�w�X���O�������ӫ~�s��
		bid.setGoods(goods);
		bidDAO.add(bid);
	}
	
	/*public Goods getGoodsByGoodsId(int goodsId) {
		return ibiddao.getGoodsByGoodsId(goodsId);		
	}*/
	
	public BidDAO getBidDAO() {
		return bidDAO;
	}

	/*public void updateGoods(Goods goods) {
		ibiddao.updateGoods(goods);
		
	}*/
	/*public void deal(int bidId) {
		Bid bid = this.ibiddao.get(bidId);
		bid.setBidStatus(new Integer(2));
		Goods goods = bid.getGoods();
		goods.setGoodsStatus(new Integer(2));
		this.ibiddao.updateGoods(goods);
		this.ibiddao.updateBid(bid);
	}*/
	
	//�ھڽs���q��ƪ�bid�����o�X���O��
	public Bid getBid(int bidId) {
		Bid bid=bidDAO.get(bidId);
		return bid;
	}
	
	//�N��ƪ�bid�����X���O����s
	public void updateBid(Bid bid) {
		bidDAO.updateBid(bid);		
	}	
}
