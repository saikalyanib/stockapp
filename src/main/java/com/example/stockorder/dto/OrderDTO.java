package com.example.stockorder.dto;

import java.io.Serializable;

public class OrderDTO implements Serializable {
	private String orderId;

	private String stockName;

	private Double stockPrice;

	private Long stockVolumePurchased;

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

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Long getStockVolumePurchased() {
		return stockVolumePurchased;
	}

	public void setStockVolumePurchased(Long stockVolumePurchased) {
		this.stockVolumePurchased = stockVolumePurchased;
	}

}
