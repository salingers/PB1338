package com.zxpm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Users buyer;
	private Users saler;
	private String goodsName;
	private Float goodsPrice;
	private String goodsPic;
	private String goodsDesc;
	private Integer goodsStatus;
	private Set bids = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Users buyer, Users saler, String goodsName,
			Float goodsPrice, Integer goodsStatus) {
		this.buyer = buyer;
		this.saler = saler;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStatus = goodsStatus;
	}

	/** full constructor */
	public Goods(Users buyer, Users saler, String goodsName,
			Float goodsPrice, String goodsPic, String goodsDesc,
			Integer goodsStatus, Set bids) {
		this.buyer = buyer;
		this.saler = saler;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsPic = goodsPic;
		this.goodsDesc = goodsDesc;
		this.goodsStatus = goodsStatus;
		this.bids = bids;
	}

	public Users getBuyer() {
		return buyer;
	}

	public void setBuyer(Users buyer) {
		this.buyer = buyer;
	}

	public Users getSaler() {
		return saler;
	}

	public void setSaler(Users saler) {
		this.saler = saler;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public String getGoodsDesc() {
		return this.goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public Set getBids() {
		return this.bids;
	}

	public void setBids(Set bids) {
		this.bids = bids;
	}

}