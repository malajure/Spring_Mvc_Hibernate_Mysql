package com.student.dao.impl;

import java.util.ArrayList;
import java.util.List;


import javax.print.attribute.standard.PrinterLocation;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.student.dao.UserDao;
import com.student.pojo.User;

@Repository("userdao")
public class UserDaoImpl implements UserDao
{
	

	@Autowired	
	SessionFactory hibernateSessionFactory;

	public void addUser(User user) 
	{
		//recive user object from service class		
		System.out.println("from Dao class"+user);
		hibernateSessionFactory.getCurrentSession().save(user);
			
	}

	@SuppressWarnings("deprecation")
	public List<User> getAllUsers() 
	{
					 return hibernateSessionFactory.getCurrentSession().createQuery("from User").list();
		
			
	}

	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int userid) {
	
		User user =(User) hibernateSessionFactory.getCurrentSession().load(User.class, userid);
		
		if ( user != null)
		{
			hibernateSessionFactory.getCurrentSession().delete(user);
		}
		else
		{
			System.out.println("failed to delete");
		}
		
	}

}
