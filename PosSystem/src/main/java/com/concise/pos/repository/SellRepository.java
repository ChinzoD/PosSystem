package com.concise.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Sell;

@Repository
public interface SellRepository extends CrudRepository<Sell, Integer>{
	

}
