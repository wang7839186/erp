package com.jing.erp.bean;

import java.io.Serializable;

/**
 * 图书类型
 * 
 * @author jing
 */
public class BookType implements Serializable {
	private static final long serialVersionUID = -6239865947570829923L;
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
