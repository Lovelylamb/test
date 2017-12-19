package com.chenshuai.dao;

import java.util.List;

import com.chenshuai.entity.Record;
import com.chenshuai.entity.Record2;

/*
 * ��¼�ķ��ʲ�
 * */
public interface RecordDao {
   public Record queryRecordById(int rid);//�鿴ָ��id���鱾�軹��¼
   //����record��¼
   public boolean saveRecord(Record record);
   //����Record��¼
   public boolean updateRecord(Record record);
   //��ѯ���н�����鱾��¼
   public List<Record2> queryAllRecords();
   
   //�鿴ָ���û����鱾�軹��¼
   public List<Record2> queryRecordByUname(String uname);
   //�鿴ָ���鱾�Ľ軹��¼
   public List<Record2> queryRecordByBname(String bname);
   //�鿴�û��Ĺ黹��¼���ѹ黹��δ�黹��
   public List<Record2> queryUserRecordByReturnTime(boolean flag,String name);
}
