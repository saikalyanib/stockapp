package com.example.stockorder.dto;

import java.io.Serializable;

public class StockRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String stockId;
	private String stockName;
	private Double stockPrice;

	public StockRequestDTO() {
		super();

	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
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

	@Override
	public String toString() {
		return "StockRequest [stockId=" + stockId + ", stockName=" + stockName + ", stockPrice=" + stockPrice + "]";
	}

}