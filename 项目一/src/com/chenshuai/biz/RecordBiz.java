package com.chenshuai.biz;

import java.util.List;

import com.chenshuai.entity.Record2;

public interface RecordBiz {
   //查看指定用户的借还记录
	public List<Record2> queryUserRecords(String uname);
	//查看指定书本的借还记录
	public List<Record2> queryBookRecords(String bname);
	
	//查看个人归还记录
	public List<Record2> queryHasReturnedRecords(String uname);
	//查看个人未归还记录
	public List<Record2> queryNoReturnedRecords(String uname);
	
	//查看所有记录
	public List<Record2> queryAllRecords();
}
