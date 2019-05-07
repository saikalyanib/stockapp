
package com.example.stockorder.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.dto.ConfirmOrderDTO;
import com.example.stockorder.dto.GetQuoteResponseDTO;
import com.example.stockorder.dto.OrderDTO;
import com.example.stockorder.dto.StockRequestDTO;
import com.example.stockorder.dto.UserRequestDTO;
import com.example.stockorder.entity.Order;
import com.example.stockorder.entity.Stock;
import com.example.stockorder.entity.User;
import com.example.stockorder.service.StockOrderService;

@RestController
@RequestMapping("/stocks")
public class StockorderController {

	@Autowired
	StockOrderService stockOrderService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/showPrice/{stockId}/{volume}")
	public CheckResponce findPrice(@PathVariable("stockId") String stockId, @PathVariable("volume") long volume) {
		return stockOrderService.findPrice(volume, stockId);

	}

	@PostMapping("/confirmOrder")
	public Order confirmOrder(@RequestBody ConfirmOrderDTO confirmOrder) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		/*
		 * String url = "http://localhost:8080/" + "{" + confirmOrder.getStockId() +
		 * "}/" + "{" + confirmOrder.getVolume();
		 * 
		 * Order ord = restTemplate.exchange(url, HttpMethod.GET, entity,
		 * Order.class).getBody();
		 */

		// CheckResponce checkResponce =
		// stockOrderService.findPrice(confirmOrder.getVolume(),
		// confirmOrder.getStockId());
		GetQuoteResponseDTO getQuoteResponse = new GetQuoteResponseDTO();

		getQuoteResponse.setStockId("123");
		getQuoteResponse.setStockName("stockName");
		getQuoteResponse.setTime(new Date());

		stockOrderService.confirmQuote(getQuoteResponse);

		return null;

	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody UserRequestDTO userRequest) {
		return stockOrderService.addUser(userRequest);
	}

	@GetMapping("/retrieveUsers")
	public List<User> retrieveUser() {
		return stockOrderService.retUser();

	}

	@PostMapping("/addStock")
	public String addingStocks(@RequestBody StockRequestDTO stockRequest) {
		return stockOrderService.addStock(stockRequest);

	}

	@GetMapping("/retrieveStocks")
	public List<Stock> retrieveStocks() {
		return stockOrderService.retStock();

	}

	@GetMapping("/reviewPastOrders/{userId}")

	public Object getPastOrders(@PathVariable("userId") String userId) {

		List<Order> orders = null;

		try {

			orders = stockOrderService.findByUserID(userId);

			if (orders.isEmpty()) {

				return "orderId not available";

			}

		}

		catch (Exception ex) {

		}

		return orders;

	}

	@GetMapping("/getOrder/{orderId}")

	public Object fetchOrder(@PathVariable("orderId") String orderId) {

		List<Order> orders = stockOrderService.findByOrderID(orderId);

		if (orders.isEmpty()) {

			return "orderId not available";

		}

		List<OrderDTO> orderDto = new ArrayList<>();

		for (Order ord : orders) {

			OrderDTO dto = new OrderDTO();

			dto.setOrderId(ord.getOrderId());

			dto.setStockName(ord.getStockName());

			dto.setStockPrice(ord.getStockPrice());

			dto.setStockVolumePurchased(ord.getStockVolumePurchased());

			orderDto.add(dto);

		}

		return orderDto;

	}
}