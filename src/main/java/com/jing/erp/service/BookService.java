package com.jing.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jing.erp.bean.Book;
import com.jing.erp.dao.BookMapper;

@Service("bookService")
public class BookService {

	@Autowired
	private BookMapper mapper;
	
	public List<Book> findAll(){
		return mapper.findAll();
	}
	
	public Book findByID(String id) {
		return mapper.findByID(id);
	}
	
	public void deleteByID(String id) {
		mapper.deleteByID(id);
	}
	
	public void deleteAll() {
		mapper.deleteAll();
	}
	
	public int updateBook(Book book) {
		return mapper.updateBook(book);
	}
	
	public void insertBook(Book book) {
		mapper.insertBook(book);
	}
	
	public void batchInsertBook(List<Book> books) {
		mapper.batchInsertBook(books);
	}
	
}
