package com.jing.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jing.erp.bean.User;
import com.jing.erp.dao.UserMapper;

@Service("userService")
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public void save(User user) {
		userMapper.save(user);
	}
	
	public List<User> findAll(){
		List<User> users = userMapper.findAll();
		return users;
	}
	
	public User findUser(String username){
		return userMapper.findUser(username);
	}
	
}
