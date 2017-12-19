package com.chenshuai.entity;

import java.io.Serializable;

/*entity��ʵ����
 * �û�ʵ����
 * */
public class User implements Serializable{
     private int id;  //�û����
     private String name; //�û�����
     private String password;//�û�����
     private int type; //�û������� ����Ա�����û�
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
		this.type = type;
		this.integral = integral;
	}
 
   //��ID�Ĺ��췽��
	public User(int id, String name, String password, int type,double integral) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	    
	public double getIntegral() {
		return integral;
	}
	
	public void setIntegral(double integral) {
		this.integral = integral;
	}

	@Override  //��дequals����
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
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
		if (type != other.type)
			return false;
		return true;
	}

	@Override//��дtoString ����
	public String toString() {
		return "(�û�ID:" + id + ",�û�����:" + name + ", �û�����:" + password + ", �û�����" + type +",�û�����:"+integral+")";
	}
         
}
