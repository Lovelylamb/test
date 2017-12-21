package com.chenshuai.biz;

import java.util.List;

import com.chenshuai.entity.Record2;

public interface RecordBiz {
   //�鿴ָ���û��Ľ軹��¼
	public List<Record2> queryUserRecords(String uname);
	//�鿴ָ���鱾�Ľ軹��¼
	public List<Record2> queryBookRecords(String bname);
	
	//�鿴���˹黹��¼
	public List<Record2> queryHasReturnedRecords(String uname);
	//�鿴����δ�黹��¼
	public List<Record2> queryNoReturnedRecords(String uname);
	
	//�鿴���м�¼
	public List<Record2> queryAllRecords();
}
