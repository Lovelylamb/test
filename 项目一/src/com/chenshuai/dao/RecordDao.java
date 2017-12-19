package com.chenshuai.dao;

import java.util.List;

import com.chenshuai.entity.Record;
import com.chenshuai.entity.Record2;

/*
 * 记录的访问层
 * */
public interface RecordDao {
   public Record queryRecordById(int rid);//查看指定id的书本借还记录
   //保存record记录
   public boolean saveRecord(Record record);
   //更新Record记录
   public boolean updateRecord(Record record);
   //查询所有借出的书本记录
   public List<Record2> queryAllRecords();
   
   //查看指定用户的书本借还记录
   public List<Record2> queryRecordByUname(String uname);
   //查看指定书本的借还记录
   public List<Record2> queryRecordByBname(String bname);
   //查看用户的归还记录（已归还，未归还）
   public List<Record2> queryUserRecordByReturnTime(boolean flag,String name);
}
