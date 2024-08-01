package com.sujata.entity;

public class CustomerShareDetail {

	private int detailId;
	private String customerId;
	private String shareName;
	private String shareType;
	private double totalPrice;
	
	public CustomerShareDetail() {
		
	}

	public CustomerShareDetail(int detailId, String customerId, String shareName, String shareType, double totalPrice) {
		super();
		this.detailId = detailId;
		this.customerId = customerId;
		this.shareName = shareName;
		this.shareType = shareType;
		this.totalPrice = totalPrice;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
