
package com.example.stockorder.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.dto.ConfirmOrder;
import com.example.stockorder.entity.Order;
import com.example.stockorder.service.StockOrderService;

@RestController
public class StockorderController {

	@Autowired
	StockOrderService stockOrderService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/payeedelete/{stockId}/{volume}")
	public CheckResponce findPrice(@PathVariable("stockId") long stockId, @PathVariable("volume") long volume) {
		return null;

	}

	@PostMapping("/confirmOrder")
	public Order confirmOrder(@RequestBody ConfirmOrder confirmOrder) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		/*
		 * restTemplate.exchange( "http://localhost:8080/" + "{" +
		 * confirmOrder.getStockId() + "}/" + "{" + confirmOrder.getVolume(),
		 * HttpMethod.GET, entity, Order.class).getBody();
		 */
		// I should get kesav pojo and prepare pojo

		// Save

		//GetQuoteResponse getQuoteResponse = new GetQuoteResponse();

		//stockOrderService.confirmQuote(getQuoteResponse);

		return null;

	}

}