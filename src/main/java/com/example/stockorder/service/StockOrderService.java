package com.example.stockorder.service;

import java.util.List;

import com.example.stockorder.dto.GetQuoteResponse;
import com.example.stockorder.entity.Stock;
import com.example.stockorder.entity.User;

public interface StockOrderService {
//public CheckResponce findPrice(Long volume, Long id);

	public List<User> retrieveUsers();

	public List<Stock> retrieveStocks();

	public void updateStock(Stock stock);

	public void confirmQuote(GetQuoteResponse getQuoteResponse);

}
