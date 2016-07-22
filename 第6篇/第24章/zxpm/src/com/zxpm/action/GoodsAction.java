package com.zxpm.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.GoodsBiz;
import com.zxpm.entity.*;

public class GoodsAction extends ActionSupport implements RequestAware,SessionAware {
	//�ϥ�GoodsBiz�ŧigoodsBiz����A�å[�Jset��k�Ω�̴ۨӤJ
	GoodsBiz goodsBiz;
	public void setGoodsBiz(GoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;
	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
	//�ϥ�Goods�������O�ŧi�ݩ�goods�A�Ω�ʸ˰Ѽ�
	private Goods goods;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	//�b��ӫ~�M��
	public String toOnSaleGoodsList(){
		List onSaleGoodsList=goodsBiz.getOnSaleGoodsList();
		request.put("onSaleGoodsList", onSaleGoodsList);
		return "onSaleGoodsList";
	}
	
	
	/*public void validateToOnSaleGoodsList() {
		this.clearErrorsAndMessages();
    }*/
	
	//�ڵo�����b��ӫ~�M��
	public String toMyGoods(){
		Goods goods=new Goods();
		//�qsession�����X�ӫ~����a
		Users saler=(Users)session.get("user");
		goods.setSaler(saler);
		//�n�D�ӫ~���A��1�A��ܸӰӫ~����X
		goods.setGoodsStatus(new Integer(1));
		//�ھګ��w����d�߰ӫ~�T���A�Y�ӫ~��a���n�J�ϥΪ̪��ӫ~�M��
		List mygoodslist=goodsBiz.getGoods(goods);
		request.put("mygoodslist", mygoodslist);
		return "mygoods";
	}
	
	//�ڭn�X��
	public String doBid(){
		//�qgoods���󤤨��o�z�L�d�ߦr��ǻ����ӫ~�s��
		int goodsId=goods.getGoodsId();		
		//�ھڰӫ~�s�����o�ӫ~�T�����x�s,�H�K�b�X���������
		Goods g=goodsBiz.getGoodsByGoodsId(goodsId);
		request.put("g", g);
		//�������D��goods_bid.jsp
		return "goodsbid";
	}
	
    //�[�J�b��ӫ~
	public String toAddGoodsInfo(){
		//�qsession�����o�W���ɮת��۹���|
		String filepath=(String)session.get("filepath");
		goods.setGoodsPic(filepath);		
		Users saler=(Users)session.get("user");
		goods.setGoodsStatus(new Integer(1));
		//�s�[�J���b��ӫ~�A�R�a�M��a�ۦP
	    goods.setSaler(saler);
	    goods.setBuyer(saler);
	    goodsBiz.addGoods(goods);
		return "index";		
	}
}
