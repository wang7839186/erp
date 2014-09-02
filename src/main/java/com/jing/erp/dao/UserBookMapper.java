package com.jing.erp.dao;

import java.util.List;

import com.jing.erp.bean.UserBook;

public interface UserBookMapper {
	void insertUB(UserBook ub);
	void batchInsertUB(List<UserBook> userBooks);
	void deleteUB(long id);
}
