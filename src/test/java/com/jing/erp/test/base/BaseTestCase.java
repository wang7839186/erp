package com.jing.erp.test.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jing.erp.bean.Book;
import com.jing.erp.bean.BookType;
import com.jing.erp.bean.UserBook;
import com.jing.erp.util.UUIDGenerator;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root-context.xml"})
public class BaseTestCase {
	
	@Test
	public void test(){
		
	}
	
	protected static final Book  book = new Book();
	protected static final List<Book> books = new ArrayList<Book>();
	
	static{
		book.setId(UUIDGenerator.generate());
		book.setBookName("²âÊÔ");
		book.setLocation("¶þÂ¥");
		book.setNum(10);
		book.setPrice(30.32d);
		BookType type = new BookType();
		type.setId(1);
		book.setType(type);
		
		for(int i = 0;i<10;i++) {
			Book temp = new Book();
			temp.setId(UUIDGenerator.generate());
			temp.setBookName("²âÊÔ");
			temp.setLocation("¶þÂ¥");
			temp.setNum(10);
			temp.setPrice(30.32d);
			temp.setType(type);
			books.add(temp);
		}
	}
	
	protected static final UserBook ub = new UserBook();
	protected static final List<UserBook> ubs = new ArrayList<UserBook>();
	static {
		ub.setBookID(UUIDGenerator.generate());
		ub.setUsername("jing");
		
		for(int i = 0;i<10;i++) {
			UserBook temp = new UserBook();
			temp.setBookID(UUIDGenerator.generate());
			temp.setUsername("test"+i);
			ubs.add(temp);
		}
	}
}
