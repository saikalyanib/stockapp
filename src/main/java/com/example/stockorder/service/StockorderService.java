package com.example.stockorder.service;

import org.springframework.stereotype.Service;

import com.example.stockorder.dto.CheckResponce;
@Service
public interface StockorderService {
	
public CheckResponce findPrice(Long volume, String stockId);

}
