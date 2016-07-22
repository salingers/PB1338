package com.zxpm.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class BidDAOImpl extends HibernateDaoSupport implements BidDAO {

	//向資料表bid中加入出價記錄
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

	//根據編號從資料表bid中取得出價記錄
	public Bid get(int bidId) {
		Bid bid=(Bid)super.getHibernateTemplate().get(Bid.class, new Integer(bidId));
		return bid;
	}

	//將資料表bid中的出價記錄更新
	public void updateBid(Bid bid) {
		super.getHibernateTemplate().update(bid);		
	}	
}	