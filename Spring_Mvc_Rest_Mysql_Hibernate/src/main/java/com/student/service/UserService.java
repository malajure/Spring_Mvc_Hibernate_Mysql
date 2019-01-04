package com.student.service;

import java.util.List;

import com.student.pojo.User;

public interface UserService {

	
	public void addUser(User user);
	 
    public List<User> getAllUsers();
 
    public User getUserById(int userid);
 
    public void updateUser(User user);
 
    public void deleteUser(int userid);
    
    
}
