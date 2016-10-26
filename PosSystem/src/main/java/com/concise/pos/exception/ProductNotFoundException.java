package com.concise.pos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@ResponseStatus(value = HttpStatus.NO_CONTENT, reason="Product Not Found for this ID")
public class ProductNotFoundException extends Exception{

	private static final long serialVersionUID = -694354952032299587L;
	
	private Integer productId;
	private String message = "Product Not Found for this ID ";
	

	
	public ProductNotFoundException() {}
	
	public ProductNotFoundException(Integer productId, String message) {
		this.productId = productId;
		
		if (message != null) this.message = message;


		
	}
	
	public String getFullMessage() {
		return (message + productId);
	}
	
	public Integer getProductId() {
		return productId;
	}
	


}
