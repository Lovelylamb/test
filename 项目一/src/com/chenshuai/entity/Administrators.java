package com.chenshuai.entity;

import java.io.Serializable;

/*
 * 管理员实体类
 * */
public class Administrators implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;   //管理员id
     private String name;  //管理员名字
     private String password;//用户密码
     private int age; //管理员年龄
     private char sex;//管理员性别
     private int level=1;//管理员级别
     
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
