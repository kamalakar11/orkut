package com.example.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IRegisterDao;
import com.example.pojo.User;

@Service
public class RegisterImpl {

	@Autowired
	IRegisterDao dao;
	
	public void saveUser(User user) {
		dao.save(user);
	}
}
