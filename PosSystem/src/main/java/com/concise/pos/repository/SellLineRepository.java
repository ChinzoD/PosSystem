package com.concise.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.SellLine;

@Repository
public interface SellLineRepository extends CrudRepository<SellLine, Integer>{

}
