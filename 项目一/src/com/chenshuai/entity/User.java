package com.chenshuai.entity;

import java.io.Serializable;

/*entity是实体类
 * 用户实体类
 * */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;  //用户编号
     private String name; //用户名字
     private String password;//用户密码
     private int    age; //用户年龄
     private char sex; //用户性别
     private int level=0; //用户级别 管理员还是用户
     private double integral;//用户积分
      //无参构造方法
     public User() {
		super();
	}
     
     //只有名字和密码的构造方法
     public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	//没有ID的构造方法
	public User(String name, String password, int type,double integral) {
		super();
		this.name = name;
		this.password = password;
		this.level = level;
		this.integral = integral;
	}
 
   //有ID的构造方法
	public User(int id, String name, String password, int type,double integral) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.level = level;
		this.integral = integral;
	}

	//get和set方法
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

	@Override//重写toString 方法
	public String toString() {
		return "(用户ID:" + id + ",用户名字:" + name + ", 用户密码:" + password +  ", 用户年龄:" + age+ ", 用户性别:" + sex +", 用户类型" + level +",用户积分:"+integral+")";
	}
         
}
