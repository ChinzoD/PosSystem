package com.concise.pos.service.impl;



import com.concise.pos.repository.SellRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Sell;
import com.concise.pos.service.SellService;

@Service
@Transactional
public class SellServiceImpl implements SellService {

	@Autowired
	SellRepository sellRepository;
	
	
	@Override
	public Sell save(Sell sell) {
		return sellRepository.save(sell);
		
	}
	@Override
	public List<Sell> findAll() {
		return (List<Sell>)sellRepository.findAll();
	}
	
	@Override
	public Sell find(Integer id) {
		return sellRepository.findOne(id);
	}
}
