package com.example.stockorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.stockorder.dto.GetQuoteResponseDTO;
import com.example.stockorder.dto.StockRequestDTO;
import com.example.stockorder.dto.UserRequestDTO;
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
	public void confirmQuote(GetQuoteResponseDTO getQuoteResponse) {

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

	@Override
	@Transactional
	public String addUser(UserRequestDTO userRequest) {
		User user = new User();

		User u1 = userRepository.findByuserId(userRequest.getUserId());

		if (u1 != null) {
			return "Validate based on the used ID existing";
		} else {

			user.setUserId(userRequest.getUserId());
			user.setName(userRequest.getName());
			user.setAddress(userRequest.getAddress());
			user.setMail(userRequest.getMail());
			user.setMobileNumber(userRequest.getMobileNumber());

			userRepository.save(user);
			return user.getName() + "Stock Successfully Added";

		}

	}

	@Override
	public List<User> retUser() {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public String addStock(StockRequestDTO stockRequest) {
		Stock stock = new Stock();

		Stock st1 = stockRepository.findBystockId(stockRequest.getStockId());

		if (st1 != null) {
			return "Validate based on the used ID existing";
		} else {
			stock.setStockId(stockRequest.getStockId());
			stock.setStockName(stockRequest.getStockName());
			stock.setStockPrice(stockRequest.getStockPrice());

			stockRepository.save(stock);
			return stockRequest.getStockName() + "Stock Successfully Added";

		}

	}

	@Override
	public List<Stock> retStock() {

		return stockRepository.findAll();
	}
}
