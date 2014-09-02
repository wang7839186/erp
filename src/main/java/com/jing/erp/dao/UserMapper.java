package com.jing.erp.dao;

import java.util.List;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.jing.erp.bean.User;

public interface UserMapper {
	
	@TriggersRemove(cacheName="baseCache",removeAll=true)
	void save(User user);
	
	@Cacheable(cacheName="baseCache")
	List<User> findAll();
	
	User findUser(String username);
}
