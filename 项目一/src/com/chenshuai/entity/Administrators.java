package com.chenshuai.entity;

import java.io.Serializable;

/*
 * ����Աʵ����
 * */
public class Administrators implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;   //����Աid
     private String name;  //����Ա����
     private String password;//�û�����
     private int age; //����Ա����
     private char sex;//����Ա�Ա�
     private int level=1;//����Ա����
     
	public Administrators() {
		super();
	}
	public Administrators(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Administrators(int id, String name, String password, int age, char sex, int level) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.level = level;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
   
}
