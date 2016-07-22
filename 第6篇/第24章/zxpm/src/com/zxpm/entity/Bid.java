package com.zxpm.entity;

import java.util.Date;

/**
 * Bid entity. @author MyEclipse Persistence Tools
 */

public class Bid implements java.io.Serializable {

	// Fields

	private Integer bidId;
	private Users buyer;
	private Goods goods;
	private Date bidTime;
	private Float bidPrice;
	private Integer bidStatus;
	
	// Constructors

	/** default constructor */
	public Bid() {
	}

	/** full constructor */
	public Bid(Users buyer, Goods goods, Date bidTime, Float bidPrice,
			Integer bidStatus) {
		this.buyer = buyer;
		this.goods = goods;
		this.bidTime = bidTime;
		this.bidPrice = bidPrice;
		this.bidStatus = bidStatus;
	}

	// Property accessors
	public Users getBuyer() {
		return buyer;
	}

	public void setBuyer(Users buyer) {
		this.buyer = buyer;
	}
	
	public Integer getBidId() {
		return this.bidId;
	}

	public void setBidId(Integer bidId) {
		this.bidId = bidId;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Date getBidTime() {
		return this.bidTime;
	}

	public void setBidTime(Date bidTime) {
		this.bidTime = bidTime;
	}

	public Float getBidPrice() {
		return this.bidPrice;
	}

	public void setBidPrice(Float bidPrice) {
		this.bidPrice = bidPrice;
	}

	public Integer getBidStatus() {
		return this.bidStatus;
	}

	public void setBidStatus(Integer bidStatus) {
		this.bidStatus = bidStatus;
	}

}