package com.concise.pos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.concise.pos.domain.Store;
import com.concise.pos.service.StockService;

@Controller
@RequestMapping(value=StockConstants.PATH)
public class StockController {

	@Autowired
	StockService stockService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Store> getStocks(){
		List<Store> stockList = stockService.findAll();
		return stockList;
	}

	@RequestMapping(value = "/{stockId}", method = RequestMethod.GET)
	public @ResponseBody Store getStock(@PathVariable("stockId") Integer stockId){
		Store store = stockService.read(stockId);
		return store;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Object saveStock(@Valid @RequestBody Store store){
		return stockService.save(store);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Object updateStock(@Valid @RequestBody Store store){
		return stockService.save(store);
	}
	
	@RequestMapping(value = "/{stockId}", method = RequestMethod.DELETE)
	public Object deleteStock(@PathVariable("stockId") Integer stockId){
		stockService.delete(stockId);
		return null;
	}
}
