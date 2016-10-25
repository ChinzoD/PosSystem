package com.concise.pos.service;

import java.util.List;

import com.concise.pos.domain.User;

 
public interface UserService {

	public void save(User user);
	public List<User> findAll();
 }
