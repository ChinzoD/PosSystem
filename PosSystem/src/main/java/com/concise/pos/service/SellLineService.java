package com.concise.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concise.pos.domain.SellLine;

public interface SellLineService {

	public List<SellLine> findAll();
	public SellLine save(SellLine sellLine);
	public SellLine find(Integer id);
}
