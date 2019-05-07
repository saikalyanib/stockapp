package com.example.stockorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockorder.dto.CheckPriceDto;
import com.example.stockorder.dto.CheckResponce;
import com.example.stockorder.entity.Stock;
import com.example.stockorder.repository.StockRepository;
@Service
public class StockorderServiceImpl implements StockorderService{
	@Autowired
	StockRepository stockRepository;

	@Override
	public CheckResponce findPrice(Long volume, String stockId) {
		CheckResponce checkresponce = new CheckResponce();
		try {
			
			List<Stock> list = stockRepository.findByStockId(stockId);
			Stock stock=list.get(0);
			
			if (stock != null) {
				CheckPriceDto checkPriceDto = new CheckPriceDto();

				checkPriceDto.setVolume(volume);
				checkPriceDto.setStockId(stockId);
				checkPriceDto.setPrice(stock.getStockPrice());
				checkPriceDto.setStockName(stock.getStockName());
			    checkPriceDto.setPrice(volume* stock.getStockPrice());
				double amount = volume* stock.getStockPrice();
				double fee;
				if (volume < 500) {

					fee = amount * 0.10 / 100;
					checkPriceDto.setFee(fee);

				} else {
					fee = amount * 0.15 / 100;
					checkPriceDto.setFee(fee);
				}

		checkPriceDto.setPurchasePrice(fee + (volume * stock.getStockPrice()));
		checkPriceDto.setWarning("Please note that the market pricing will keeping changing so the final price used for trade execution will vary");

				checkresponce.setStatusCode(200);
				checkresponce.setStatusMessage("sucess");
				checkresponce.setCheckPriceDto(checkPriceDto);
				return checkresponce;
			} else {

				checkresponce.setStatusCode(404);
				checkresponce.setStatusMessage("stock not fouund send proper stockId");
				checkresponce.setCheckPriceDto(new CheckPriceDto());

				return checkresponce;
			}
		} catch (Exception e) {

			checkresponce.setStatusCode(1);
			checkresponce.setStatusMessage("Application problem");
			checkresponce.setCheckPriceDto(new CheckPriceDto());
			return checkresponce;

		}

	}


}
