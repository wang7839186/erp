package com.jing.erp.test.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jing.erp.bean.Book;
import com.jing.erp.dao.BookMapper;
import com.jing.erp.test.base.BaseTestCase;

public class BookMapperTest extends BaseTestCase{
		
	@Autowired
	private BookMapper mapper;
	
	@Test
	public void testFindAll(){
		mapper.findAll();
	}
	
	@Test
	public void testFindByID(){
		mapper.findByID("8a4680dd47cadd2b0147cadd2b4d0000");
	}
	
	@Test
	public void testInsertBook(){
		mapper.insertBook(book);
	}
	
	@Test
	public void testBatchInsertBook() {
		mapper.batchInsertBook(books);
	}
	
	@Test
	public void testUpdateBook() {
		List<Book> list = mapper.findAll();
		if(CollectionUtils.isNotEmpty(list)) {
			Book temp = list.get(0);
			temp.setBookName("¸üÐÂ×Ö¶Î");
			mapper.updateBook(temp);
		}
	}
	
	@Test
	public void testOptimisticLock(){
		Book book = mapper.findByID("8a4680dd47cadd2b0147cadd2b4d0000");
		Book book2 = mapper.findByID("8a4680dd47cadd2b0147cadd2b4d0000");
		
		book.setNum(2);
		book2.setNum(4);
		
		int num = mapper.updateBook(book);
		int num2 = mapper.updateBook(book2);
		
		System.out.println(num+","+num2);
	}
	
}
