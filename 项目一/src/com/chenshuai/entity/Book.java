package com.chenshuai.entity;

import java.io.Serializable;

/*
 * 书本的实体类
 * */
public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;   //书本id
       private String name; //书本的名字
       private String category;//书本类别
       private String author; //书本作者
       private int bcount;  //书本的余量
       private int status;  //书本是否借出的状态
       private String description;  //书本信息的描述
   
   public Book() {
	   super();
   }
   
   
   public Book(String name, String category, String author, int bcount, int status, String description) {
	super();
	this.name = name;
	this.category = category;
	this.author = author;
	this.bcount = bcount;
	this.status = status;
	this.description = description;
}


public Book(int id, String name, String author, int bcount, String description) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.bcount = bcount;
	this.description = description;
   }


   public Book(String name, String author, int status,int bcount) {
	   super();
	   this.name = name;
	   this.author = author;
	   this.status = status;
	   this.bcount = bcount;   	   	   
   }

   

   public Book(int id, String name, String category, String author, int bcount, int status, String description) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.author = author;
	this.bcount = bcount;
	this.status = status;
	this.description = description;
   }

   public int getId() {
	   return id;
   }

   public void setId(int id) {
	   this.id = id;
   }

   public String getName() {
	   return name;
   }

   public void setName(String name) {
	   this.name = name;
   }
   
   
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "("+"书本id:" + id + ", 书名:" + name +", 类别:" + category +", 作者:" + author + ", 书本剩余:" + bcount + ", 书本状态:" + status + ", 书本描述:"
				+ description + ")";
	}

}
