package com.concise.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concise.pos.domain.Sell;

public interface SellService {

	public List<Sell> findAll();
	public Sell save(Sell sell);
	public Sell find(Integer id);
}
