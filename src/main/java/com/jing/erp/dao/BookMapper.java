package com.jing.erp.dao;

import java.util.List;

import com.jing.erp.bean.Book;


public interface BookMapper {
	
	List<Book> findAll();
	
	Book findByID(String id);
	
	void deleteByID(String id);
	
	void deleteAll();
	
	int updateBook(Book book);
	
	void insertBook(Book book);
	
	void batchInsertBook(List<Book> books);
}
