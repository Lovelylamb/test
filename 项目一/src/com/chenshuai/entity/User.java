package com.chenshuai.entity;

import java.io.Serializable;

/*entity��ʵ����
 * �û�ʵ����
 * */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;  //�û����
     private String name; //�û�����
     private String password;//�û�����
     private int    age; //�û�����
     private char sex; //�û��Ա�
     private int level=0; //�û����� ����Ա�����û�
     private double integral;//�û�����
      //�޲ι��췽��
     public User() {
		super();
	}
     
     //ֻ�����ֺ�����Ĺ��췽��
     public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	//û��ID�Ĺ��췽��
	public User(String name, String password, int type,double integral) {
		super();
		this.name = name;
		this.password = password;
		this.level = level;
		this.integral = integral;
	}
 
   //��ID�Ĺ��췽��
	public User(int id, String name, String password, int type,double integral) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.level = level;
		this.integral = integral;
	}

	//get��set����
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

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	    
	public double getIntegral() {
		return integral;
	}
	
	public void setIntegral(double integral) {
		this.integral = integral;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(integral) != Double.doubleToLongBits(other.integral))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (sex != other.sex)
			return false;
		if (level != other.level)
			return false;
		return true;
	}

	@Override//��дtoString ����
	public String toString() {
		return "(�û�ID:" + id + ",�û�����:" + name + ", �û�����:" + password +  ", �û�����:" + age+ ", �û��Ա�:" + sex +", �û�����" + level +",�û�����:"+integral+")";
	}
         
}
