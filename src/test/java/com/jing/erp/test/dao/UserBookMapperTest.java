package com.jing.erp.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jing.erp.dao.UserBookMapper;
import com.jing.erp.test.base.BaseTestCase;

public class UserBookMapperTest extends BaseTestCase{
	
	@Autowired
	private UserBookMapper mapper;
	
	@Test
	public void testInsert() {
		mapper.insertUB(ub);
	}
	
	@Test
	public void testBatchInsert() {
		mapper.batchInsertUB(ubs);
	}
	
	@Test
	public void testDelete() {
		mapper.deleteUB(1);
	}
	
}
