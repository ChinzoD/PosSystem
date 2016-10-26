package com.concise.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

	
	

}
