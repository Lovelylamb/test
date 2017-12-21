package com.chenshuai.entity;

import java.io.Serializable;

/*
 * �Զ���ʵ�������
 * */
public class Record2 implements Serializable{
private static final long serialVersionUID = 1L;
private int id;  //��¼id
   private int bid;  //�鱾id
   private String uname; //�û���
   private String bname; //�鱾��
   private String lendTime;//���ʱ��
   private String returnTime;//�黹ʱ��
    
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
		return "��¼ID:" + id + ", �鱾ID:" + bid + ", �Ñ�����:" + uname + ",�鱾����:" + bname + ", ���ʱ��:" + lendTime
				+ ", �黹ʱ��:" + returnTime + ")";
	}  
}
