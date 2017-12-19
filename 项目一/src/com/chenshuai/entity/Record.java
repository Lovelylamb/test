package com.chenshuai.entity;
/*
 * 记录信息的实体类
 * */
public class Record {
    private int id;   //这个记录的编号
    private int uid;  //借书的那个用户的编号
    private int bid; //借出的那本书的编号
    private String lendTime; //书本借出时间
    private String returnTime;//书本归还时间
      
	public Record() {
		super();
	}

	public Record(int uid, int bid, String lendTime, String returnTime) {
		super();
		this.uid = uid;
		this.bid = bid;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}
	
	public Record(int id, int uid, int bid, String lendTime, String returnTime) {
		super();
		this.id = id;
		this.uid = uid;
		this.bid = bid;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
		return "记录ID:" + id + ", 用户的ID:" + uid + ", 书本的ID:" + bid + ",借出日期:" + lendTime + ",归还日期: "
				+ returnTime + ")";
	}
      
}
