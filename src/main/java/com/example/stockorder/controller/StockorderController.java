package com.example.stockorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.service.StockorderService;

@RestController
public class StockorderController {
	
@Autowired
StockorderService stockorderService;

	@GetMapping("/payeedelete/{stockId}/{volume}")
	public CheckResponce findPrice(@PathVariable("stockId") long stockId,@PathVariable("volume") long volume ){
		 return stockorderService.findPrice(stockId,volume);
		
}
}