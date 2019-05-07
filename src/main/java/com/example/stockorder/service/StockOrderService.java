package com.example.stockorder.service;

import java.util.List;

import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.dto.GetQuoteResponseDTO;
import com.example.stockorder.dto.StockRequestDTO;
import com.example.stockorder.dto.UserRequestDTO;
import com.example.stockorder.entity.Stock;
import com.example.stockorder.entity.User;

public interface StockOrderService {
public CheckResponce findPrice(Long volume, String stockId);

	public List<User> retrieveUsers();

	public List<Stock> retrieveStocks();

	public void updateStock(Stock stock);

	public void confirmQuote(GetQuoteResponseDTO getQuoteResponse);

	public String addUser(UserRequestDTO userRequest);

	public List<User> retUser();

	public String addStock(StockRequestDTO stockRequest);

	public List<Stock> retStock();

}
