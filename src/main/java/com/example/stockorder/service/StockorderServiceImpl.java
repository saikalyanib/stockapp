package com.example.stockorder.service;

import com.example.stockorder.dto.CheckResponce;

public class StockorderServiceImpl implements StockorderService{
	

	/*@Override
	public CheckResponce findPrice(Long volume, Long id) {
		CheckResponce checkresponce = new CheckResponce();
		try {
			
			List<Stock> list = stockRepository.findByStockId(stockId);
			
			if (stock != null) {
				CheckPriceDto checkPriceDto = new CheckPriceDto();

				checkPriceDto.setdayOfMonth(Calendar.DAY_OF_MONTH);
				checkPriceDto.setVolumeOfPurchase(checkRequest.getNoOfShares());
				checkPriceDto.setStockId(checkRequest.getId());
				checkPriceDto.setPrice(stock.getStockPrice());
				checkPriceDto.setName(stock.getStockName());
			checkPriceDto.setTotalStockPrice(volume * stock.getStockPrice());
				double amount = volume* stock.getStockPrice();
				double fee;
				if (volume < 500) {

					fee = amount * 0.10 / 100;
					checkPriceDto.setFee(fee);

				} else {

					fee = amount * 0.15 / 100;
					checkPriceDto.setFee(fee);
				}

		checkPriceDto.setTotalIncludeFee(fee + (volume * stock.getStockPrice()));

				checkresponce.setStstusCode(200);
				checkresponce.setStstusMessage("sucess");
				checkresponce.setCheckPriceDto(checkPriceDto);
				return checkresponce;
			} else {

				checkresponce.setStstusCode(404);
				checkresponce.setStstusMessage("stock not fouund send proper stockId");
				checkresponce.setCheckPriceDto(new CheckPriceDto());

				return checkresponce;
			}
		} catch (Exception e) {

			checkresponce.setStstusCode(1);
			checkresponce.setStstusMessage("Application problem");
			checkresponce.setCheckPriceDto(new CheckPriceDto());
			return checkresponce;

		}

	}
*/

}
