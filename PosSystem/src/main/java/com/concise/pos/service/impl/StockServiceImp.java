package com.concise.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Store;
import com.concise.pos.repository.StockRepository;
import com.concise.pos.service.StockService;

@Service
@Transactional
public class StockServiceImp implements StockService {
	
	@Autowired
	StockRepository stockRepository;

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Store save(Store store) {
		return stockRepository.save(store);
	}

	@Override
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void update(Store store) {
		stockRepository.save(store);
	}

	@Override
	public void delete(Integer stockId) {
		stockRepository.delete(stockId);
	}

	@Override
	public Store read(Integer stockId) {
		return stockRepository.findOne(stockId);
	}

	@Override
	public List<Store> findAll() {
		return (List<Store>) stockRepository.findAll();
	}

}
