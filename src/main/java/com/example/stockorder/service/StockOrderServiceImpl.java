package com.example.stockorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockorder.dto.GetQuoteResponse;
import com.example.stockorder.entity.Order;
import com.example.stockorder.entity.Stock;
import com.example.stockorder.entity.User;
import com.example.stockorder.repository.OrderRepository;
import com.example.stockorder.repository.StockRepository;
import com.example.stockorder.repository.UserRepository;

@Service
public class StockOrderServiceImpl implements StockOrderService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<User> retrieveUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<Stock> retrieveStocks() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}

	@Override
	public void updateStock(Stock stock) {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirmQuote(GetQuoteResponse getQuoteResponse) {

		Order order = new Order();
		order.setStockId(getQuoteResponse.getStockId());
		order.setStockName(getQuoteResponse.getStockName());
		order.setStockPrice(getQuoteResponse.getPrice());
		order.setStockPurchasePrice(getQuoteResponse.getPurchasePrice());
		order.setStockTotalFees(getQuoteResponse.getTotalFee());
		order.setStockVolumePurchased(getQuoteResponse.getVolume());

		orderRepository.save(order);
	}

	/*
	 * @Override public CheckResponce findPrice(Long volume, Long id) {
	 * CheckResponce checkresponce = new CheckResponce(); try {
	 * 
	 * List<Stock> list = stockRepository.findByStockId(stockId);
	 * 
	 * if (stock != null) { CheckPriceDto checkPriceDto = new CheckPriceDto();
	 * 
	 * checkPriceDto.setdayOfMonth(Calendar.DAY_OF_MONTH);
	 * checkPriceDto.setVolumeOfPurchase(checkRequest.getNoOfShares());
	 * checkPriceDto.setStockId(checkRequest.getId());
	 * checkPriceDto.setPrice(stock.getStockPrice());
	 * checkPriceDto.setName(stock.getStockName());
	 * checkPriceDto.setTotalStockPrice(volume * stock.getStockPrice()); double
	 * amount = volume* stock.getStockPrice(); double fee; if (volume < 500) {
	 * 
	 * fee = amount * 0.10 / 100; checkPriceDto.setFee(fee);
	 * 
	 * } else {
	 * 
	 * fee = amount * 0.15 / 100; checkPriceDto.setFee(fee); }
	 * 
	 * checkPriceDto.setTotalIncludeFee(fee + (volume * stock.getStockPrice()));
	 * 
	 * checkresponce.setStstusCode(200); checkresponce.setStstusMessage("sucess");
	 * checkresponce.setCheckPriceDto(checkPriceDto); return checkresponce; } else {
	 * 
	 * checkresponce.setStstusCode(404);
	 * checkresponce.setStstusMessage("stock not fouund send proper stockId");
	 * checkresponce.setCheckPriceDto(new CheckPriceDto());
	 * 
	 * return checkresponce; } } catch (Exception e) {
	 * 
	 * checkresponce.setStstusCode(1);
	 * checkresponce.setStstusMessage("Application problem");
	 * checkresponce.setCheckPriceDto(new CheckPriceDto()); return checkresponce;
	 * 
	 * }
	 * 
	 * }
	 */

}
