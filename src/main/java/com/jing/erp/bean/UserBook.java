package com.jing.erp.bean;

import java.io.Serializable;

/**
 * 用户和图书对应关系
 * @author jing
 *
 */
public class UserBook implements Serializable {
	private static final long serialVersionUID = 1354968265628187540L;
	private long id;
	private String bookID;
	private String username;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
