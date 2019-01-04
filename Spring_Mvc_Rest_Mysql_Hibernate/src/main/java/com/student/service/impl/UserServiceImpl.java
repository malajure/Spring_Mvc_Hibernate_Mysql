package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.UserDao;
import com.student.pojo.User;
import com.student.service.UserService;

@Service
@EnableTransactionManagement

public class UserServiceImpl implements UserService
{

	
	//dao class ref bean
	@Autowired
	UserDao userdao;
	
	@Transactional
	public void addUser(User user) {
		
		System.out.println("from Service"+ user);
		//recieve use object from controller class
	    userdao.addUser(user);
		
		
	}

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Transactional
	public List<User> getAllUsers() {
		
		List<User> userList = userdao.getAllUsers();
		
		System.out.println("Service class");
		
		return userList;
	}

	@Transactional
	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteUser(int userid) {
	  userdao.deleteUser(userid);
		
	}

}
