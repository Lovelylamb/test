package com.chenshuai.entity;

import java.io.Serializable;

/*
 * 自定义实体类对象
 * */
public class Record2 implements Serializable{
private static final long serialVersionUID = 1L;
private int id;  //记录id
   private int bid;  //书本id
   private String uname; //用户名
   private String bname; //书本名
   private String lendTime;//借出时间
   private String returnTime;//归还时间
    
	public Record2() {
		super();
	}
	public Record2(String uname, String bname, String lendTime, String returnTime) {
		super();
		this.uname = uname;
		this.bname = bname;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}
	public Record2(int id, String uname, String bname, String lendTime, String returnTime) {
		super();
		this.id = id;
		this.uname = uname;
		this.bname = bname;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getLendTime() {
		return lendTime;
	}
	public void setLendTime(String lendTime) {
		this.lendTime = lendTime;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	@Override
	public String toString() {
		return "记录ID:" + id + ", 书本ID:" + bid + ", 用戶名字:" + uname + ",书本名字:" + bname + ", 借出时间:" + lendTime
				+ ", 归还时间:" + returnTime + ")";
	}  
}
