package com.example.stockorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.service.StockorderService;

@RestController
@RequestMapping("/stocks")
public class StockorderController {
	
@Autowired
StockorderService stockorderService;

	@GetMapping("/showPrice/{stockId}/{volume}")
	public CheckResponce findPrice(@PathVariable("stockId") String stockId,@PathVariable("volume") long volume ){
		 return stockorderService.findPrice(volume,stockId);
		
}
}