package com.example.stockorder.dto;

import java.io.Serializable;

public class CheckPriceDto implements Serializable {
	private String stockId;
	private String stockName;
	private Long volume;
	private Double price;
	private Double purchasePrice;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	private Double fee;
	private String warning;
	public String getStockId() {
		return stockId;
	}
	}
