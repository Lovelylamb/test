package com.chenshuai.entity;

import java.io.Serializable;

/*
 * �鱾��ʵ����
 * */
public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;   //�鱾id
       private String name; //�鱾������
       private String category;//�鱾���
       private String author; //�鱾����
       private int bcount;  //�鱾������
       private int status;  //�鱾�Ƿ�����״̬
       private String description;  //�鱾��Ϣ������
   
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
		return "("+"�鱾id:" + id + ", ����:" + name +", ���:" + category +", ����:" + author + ", �鱾ʣ��:" + bcount + ", �鱾״̬:" + status + ", �鱾����:"
				+ description + ")";
	}

}
