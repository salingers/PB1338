package com.zxpm.dao.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class GoodsDAOImpl extends HibernateDaoSupport implements GoodsDAO {

	//加入待拍商品
	public void addGoods(Goods goods) {
		super.getHibernateTemplate().save(goods);
	}

	//根據條件取得商品清單
	public List search(final Goods condition) {
		return super.getHibernateTemplate().executeFind(
				  new HibernateCallback(){
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						Criteria criteria=session.createCriteria(Goods.class);
						if(null!=condition){
							if(condition.getGoodsStatus()!=null &&!condition.getGoodsStatus().equals("")){
								//根據商品狀態篩選
								criteria.add(Restrictions.eq("goodsStatus", condition.getGoodsStatus()));
							}
							if(condition.getSaler()!=null){
								//根據商品賣家篩選
								criteria.add(Restrictions.eq("saler", condition.getSaler()));
							}
						}
						return criteria.list();
					}
				  });
	}

	public List get(int goodsId) {
		Goods goods=(Goods)super.getHibernateTemplate().get(Goods.class, new Integer(goodsId));
		List list=new ArrayList();
		list.add(goods);
		return list;
	}

	public void updateGoods(Goods goods) {
		super.getHibernateTemplate().update(goods);
		
	}
	
	//根據商品編號取得商品訊息
	public Goods getGoodsByGoodsId(int goodsId) {
		Goods goods=(Goods)super.getHibernateTemplate().get(Goods.class, new Integer(goodsId));
		return goods;
	}	
}
