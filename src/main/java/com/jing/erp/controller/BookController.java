package com.jing.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jing.erp.bean.Book;
import com.jing.erp.constant.Constants;
import com.jing.erp.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="books",method=RequestMethod.GET)
	public ModelAndView toBooks(){
		ModelAndView mv = new ModelAndView("book/books");
		Book book = new Book();
		book.getPageInfo().setStartIndex(0);
		book.getPageInfo().setPageSize(Constants.BOOK_PAGE_SIZE);
		mv.addObject("book",book);
		return mv;
	}
	
	@RequestMapping(value="fetchAll",method=RequestMethod.POST)
	public ModelAndView findAll(Book book){
		ModelAndView mv = new ModelAndView("book/books");
		List<Book> list = bookService.findAll();
		mv.addObject("books", list);
		mv.addObject("book", book);
		return mv;
	}
	
}
