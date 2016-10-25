package com.concise.pos.service;

import java.util.List;

import com.concise.pos.domain.Store;

public interface StockService {

	Store save(Store store);

	void update(Store store);

	void delete(Integer stockId);

	Store read(Integer stockId);

	List<Store> findAll();
}
