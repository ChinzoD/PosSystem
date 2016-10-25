package com.concise.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Store;

@Repository
public interface StockRepository extends CrudRepository<Store, Integer> { 

}
