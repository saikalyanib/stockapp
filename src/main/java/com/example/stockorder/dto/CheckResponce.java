package com.example.stockorder.dto;

import java.io.Serializable;

public class CheckResponce implements Serializable{
	private int statusCode;
	private String statusMessage;
	private CheckPriceDto checkPriceDto;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public CheckPriceDto getCheckPriceDto() {
		return checkPriceDto;
	}
	public void setCheckPriceDto(CheckPriceDto checkPriceDto) {
		this.checkPriceDto = checkPriceDto;
	}

}
