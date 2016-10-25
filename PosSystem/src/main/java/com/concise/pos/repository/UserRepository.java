package com.concise.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	
}
