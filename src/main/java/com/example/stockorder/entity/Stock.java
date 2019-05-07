package com.example.stockorder.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String StockId;
	private String StockName;
	private String StockPrice;
	private Long Volume;

	public Stock() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStockId() {
		return StockId;
	}

	public void setStockId(String stockId) {
		StockId = stockId;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public String getStockPrice() {
		return StockPrice;
	}

	public void setStockPrice(String stockPrice) {
		StockPrice = stockPrice;
	}

	public Long getVolume() {
		return Volume;
	}

	public void setVolume(Long volume) {
		Volume = volume;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", StockId=" + StockId + ", StockName=" + StockName + ", StockPrice=" + StockPrice
				+ ", Volume=" + Volume + "]";
	}

}
