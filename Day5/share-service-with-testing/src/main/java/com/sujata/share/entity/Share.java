package com.sujata.share.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shares")
public class Share {

	@Id
	private int shareId;
	private String shareName;
	@Column(name = "MarketPrice")
	private double price;
	
	public Share() {
		
	}

	public Share(int shareId, String shareName, double price) {
		super();
		this.shareId = shareId;
		this.shareName = shareName;
		this.price = price;
	}

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
