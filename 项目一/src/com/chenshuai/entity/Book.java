package com.chenshuai.entity;
/*
 * 书本的实体类
 * */
public class Book {
       private int id;   //书本id
       private String name; //书本的名字
       private int bcount;  //书本的借出次数
       private int status;  //书本是否借出的状态
       private String description;  //书本信息的描述
   
   public Book() {
	   super();
   }

   public Book(String name, int bcount, int status,String description) {
	   super();
	   this.name = name;
	   this.bcount = bcount;
	   this.status = status;
	   this.description = description;
	   
   }

   public Book(int id, String name, int bcount, int status,String description) {
	   super();
	   this.id = id;
	   this.name = name;
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
		return "(书本id:" + id + ", 书名:" + name + ", 借出次数:" + bcount + ", 书本状态:" + status + ", 书本描述:"
				+ description + ")";
	}

}
