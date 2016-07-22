package com.zxpm.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class BidDAOImpl extends HibernateDaoSupport implements BidDAO {

	//�V��ƪ�bid���[�J�X���O��
	public void add(Bid bid) {
		super.getHibernateTemplate().save(bid);
	}

	/*public Goods getGoodsByGoodsId(int goodsId) {
		Goods goods=(Goods)super.getHibernateTemplate().get(Goods.class, new Integer(goodsId));
		return goods;
	}*/
	/*public void updateGoods(Goods goods) {
		super.getHibernateTemplate().update(goods);		
	}*/

	//�ھڽs���q��ƪ�bid�����o�X���O��
	public Bid get(int bidId) {
		Bid bid=(Bid)super.getHibernateTemplate().get(Bid.class, new Integer(bidId));
		return bid;
	}

	//�N��ƪ�bid�����X���O����s
	public void updateBid(Bid bid) {
		super.getHibernateTemplate().update(bid);		
	}	
}	