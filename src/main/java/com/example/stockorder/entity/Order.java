package com.example.stockorder.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5288694851992249717L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String stockId;
	private String orderId;
	private String stockName;
	private Double stockPrice;
	private Long stockVolumePurchased;
	private Double stockPurchasePrice;
	private Double fees;
	private Double stockTotalFees;

	@UpdateTimestamp
	private Date time;

	public Order() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Long getStockVolumePurchased() {
		return stockVolumePurchased;
	}

	public void setStockVolumePurchased(Long stockVolumePurchased) {
		this.stockVolumePurchased = stockVolumePurchased;
	}

	public Double getStockPurchasePrice() {
		return stockPurchasePrice;
	}

	public void setStockPurchasePrice(Double stockPurchasePrice) {
		this.stockPurchasePrice = stockPurchasePrice;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Double getStockTotalFees() {
		return stockTotalFees;
	}

	public void setStockTotalFees(Double stockTotalFees) {
		this.stockTotalFees = stockTotalFees;
	}

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", stockId=" + stockId + ", orderId=" + orderId + ", stockName=" + stockName
				+ ", StockPrice=" + stockPrice + ", stockVolumePurchased=" + stockVolumePurchased
				+ ", stockPurchasePrice=" + stockPurchasePrice + ", fees=" + fees + ", stockTotalFees=" + stockTotalFees
				+ ", timeOfTrade=" + time + "]";
	}

}
