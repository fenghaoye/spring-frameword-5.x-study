package com.fh.project.service;

import com.fh.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements UserService{

	public OrderServiceImpl() {
		System.out.println("OrderServiceImpl init...");
	}

	@Override
	public void query(){
		System.out.println("OrderServiceImpl query...");
	}
}
