package com.chenshuai.entity;
/*
 * �鱾��ʵ����
 * */
public class Book {
       private int id;   //�鱾id
       private String name; //�鱾������
       private int bcount;  //�鱾�Ľ������
       private int status;  //�鱾�Ƿ�����״̬
       private String description;  //�鱾��Ϣ������
   
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
		return "(�鱾id:" + id + ", ����:" + name + ", �������:" + bcount + ", �鱾״̬:" + status + ", �鱾����:"
				+ description + ")";
	}

}
