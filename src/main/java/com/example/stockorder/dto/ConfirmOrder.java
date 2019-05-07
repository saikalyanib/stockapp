package com.example.stockorder.dto;

import java.io.Serializable;

import javax.persistence.Entity;

public class ConfirmOrder implements Serializable {

	private static final long serialVersionUID = -5580180921918136752L;
	private String userId;
	private String stockId;
	private String stockName;
	private String status;
	private Long volume;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
