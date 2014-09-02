package com.jing.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jing.erp.bean.UserBook;
import com.jing.erp.dao.UserBookMapper;

@Service("userBookService")
public class UserBookService {

	@Autowired
	private UserBookMapper userBookMapper;

	public void insertUB(UserBook ub) {
		userBookMapper.insertUB(ub);
	}

	public void batchInsertUB(List<UserBook> userBooks) {
		userBookMapper.batchInsertUB(userBooks);
	}

	public void deleteUB(long id) {
		userBookMapper.deleteUB(id);
	}

}
