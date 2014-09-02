package com.jing.erp.bean;

import java.io.Serializable;

import com.jing.erp.util.Pagination;

/**
 * 图书实体类
 * @author jing
 *
 */
public class Book implements Serializable{

	private static final long serialVersionUID = -5848000758611725489L;
	
	private String id;
	private String bookName;
	private int num;
	private double price;
	private BookType type;
	private String location;
	private String version;
	private Pagination pageInfo = new Pagination(0, 10, 1);

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Pagination getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(Pagination pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	

}
