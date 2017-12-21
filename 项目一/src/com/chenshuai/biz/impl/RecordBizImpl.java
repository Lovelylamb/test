package com.chenshuai.biz.impl;

import java.util.List;

import com.chenshuai.biz.RecordBiz;
import com.chenshuai.dao.RecordDao;
import com.chenshuai.dao.impl.RecordDaoImpl;
import com.chenshuai.entity.Record2;

public class RecordBizImpl implements RecordBiz {
   private RecordDao recordDao = new RecordDaoImpl();
    /**
     * ��ѯָ���û��Ľ軹��¼
     */
	@Override
	public List<Record2> queryUserRecords(String uname) {	
		return recordDao.queryRecordByUname(uname);
	}
    /**
     * �鿴ָ���鱾�Ľ軹��¼
     */
	@Override
	public List<Record2> queryBookRecords(String bname) {
		return recordDao.queryRecordByBname(bname);
	}
   /**
    * �鿴�ѹ黹�ļ�¼
    */
	@Override
	public List<Record2> queryHasReturnedRecords(String uname) {
		return recordDao.queryUserRecordByReturnTime(true, uname);
	}
     /**
      * �鿴δ�黹��¼
      */
	@Override
	public List<Record2> queryNoReturnedRecords(String uname) {
		return recordDao.queryUserRecordByReturnTime(false, uname);
	}
   /**
    * ��ѯ���еĽ軹��¼
    */
	@Override
	public List<Record2> queryAllRecords() {
		return recordDao.queryAllRecords();
	}

}
