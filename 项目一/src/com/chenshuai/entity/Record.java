package com.chenshuai.entity;
/*
 * ��¼��Ϣ��ʵ����
 * */
public class Record {
    private int id;   //�����¼�ı��
    private int uid;  //������Ǹ��û��ı��
    private int bid; //������Ǳ���ı��
    private String lendTime; //�鱾���ʱ��
    private String returnTime;//�鱾�黹ʱ��
      
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
		return "��¼ID:" + id + ", �û���ID:" + uid + ", �鱾��ID:" + bid + ",�������:" + lendTime + ",�黹����: "
				+ returnTime + ")";
	}
      
}
