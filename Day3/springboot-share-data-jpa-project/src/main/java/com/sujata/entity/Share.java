package com.sujata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Atleast we need to add two Annotation while mapping my class with the table in the DB : @Entity and @Id
 * if while mapping we are not giving the name of the table then the name of the table will be same as that of your class name
 */

@Entity
@Table(name = "Shares")
public class Share {

	/*
	 * @Id will specify the Primary Key
	 */
	@Id
	@Column(name = "ShareId")  //if column name in table is same as that of your property name in classs then giving @Column is Optional
	private int shareId;
	@Column(name="ShareName")
	private String shareName;
	private double marketPrice;
	
	public Share() {
		
	}

	public Share(int shareId, String shareName, double marketPrice) {
		super();
		this.shareId = shareId;
		this.shareName = shareName;
		this.marketPrice = marketPrice;
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

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Override
	public String toString() {
		return "Share [shareId=" + shareId + ", shareName=" + shareName + ", marketPrice=" + marketPrice + "]";
	}
	
	
}
