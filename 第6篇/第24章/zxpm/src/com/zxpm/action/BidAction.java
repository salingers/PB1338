package com.zxpm.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.*;
import com.zxpm.entity.*;

public class BidAction extends ActionSupport implements RequestAware,SessionAware {
	//�ϥ�GoodsBiz�ŧigoodsBiz����A�å[�Jset��k�Ω�̴ۨӤJ
	GoodsBiz goodsBiz;	
	public void setGoodsBiz(GoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
	}
	//�ϥ�BidBiz�ŧibidBiz����A�å[�Jset��k�Ω�̴ۨӤJ
	BidBiz bidBiz;
	public void setBidBiz(BidBiz bidBiz) {
		this.bidBiz = bidBiz;
	}	
	//�ϥ�UserBiz�ŧiuserBiz����A�å[�Jset��k�Ω�̴ۨӤJ
	UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;	
	//�ŧi�ݩ�myBidPrice�A�Ω�ʸ˪��Ѽ�
	private Float myBidPrice;	
	public Float getMyBidPrice() {
		return myBidPrice;
	}
	public void setMyBidPrice(Float myBidPrice) {
		this.myBidPrice = myBidPrice;
	}
	//�ŧi����goods�A�Ω�ʸ˪��Ѽ�
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
	//�ŧi�ݩ�bidId�MbuyerId�A�Ω�ʸ˨ϥΪ̶ǰe���Ѽ�
	private int bidId;
	private int buyerId;	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getBidId() {
		return bidId;
	}
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	//�ǰe�ڪ�����
	public String doSubmitBid(){
		//goods���󤤫ʸˤF�X�������z�L���ê���ǻ����ӫ~�s���Ѽ�
		int goodsId=goods.getGoodsId().intValue();
		//�ھڰӫ~�s�����o�ӫ~�T��
   		Goods goods=goodsBiz.getGoodsByGoodsId(goodsId);
   		//�qsession�����X�n�J�ϥΪ̪���A�@���X���ɰӫ~���R�a
   		Users buyer=(Users)session.get("user");	
   		//�I�s�~�Ȥ�k�V��ƪ�bid���g�J�O��
   		bidBiz.addBid(goods, buyer, myBidPrice);
		return "index";		
	}
	
	//����
	public String doDeal(){
		//�ھڽs���q��ƪ�bid�����o�X���O��
   		Bid bid=bidBiz.getBid(bidId);
   		//�ھ����p���t�A�q�X���O�������o�ӫ~����
   		Goods goods=bid.getGoods();
   		//�����A�N���o���X���O�����A�]�w��2
   		bid.setBidStatus(new Integer(2));
   		//�N��ƪ�bid�����X���O����s
   		bidBiz.updateBid(bid); 
   		//�ھڶR�a�s�����o�R�a�ϥΪ̪���
   		Users buyer=userBiz.getUsersById(buyerId); 
   		//�N��ƪ�Goods��������ӫ~�����A�]�w��2�A��ܸӰӫ~�w����
   		goods.setGoodsStatus(new Integer(2));
   		//�]�w��ƪ�Goods������ӫ~���R�a
   		goods.setBuyer(buyer);
   		//��s���Goods
   		goodsBiz.updateGoods(goods);
		return "index";
		
	}
}
