package com.chenshuai.biz.impl;

import java.util.List;

import com.chenshuai.biz.RecordBiz;
import com.chenshuai.dao.RecordDao;
import com.chenshuai.dao.impl.RecordDaoImpl;
import com.chenshuai.entity.Record2;

public class RecordBizImpl implements RecordBiz {
   private RecordDao recordDao = new RecordDaoImpl();
    /**
     * 查询指定用户的借还记录
     */
	@Override
	public List<Record2> queryUserRecords(String uname) {	
		return recordDao.queryRecordByUname(uname);
	}
    /**
     * 查看指定书本的借还记录
     */
	@Override
	public List<Record2> queryBookRecords(String bname) {
		return recordDao.queryRecordByBname(bname);
	}
   /**
    * 查看已归还的记录
    */
	@Override
	public List<Record2> queryHasReturnedRecords(String uname) {
		return recordDao.queryUserRecordByReturnTime(true, uname);
	}
     /**
      * 查看未归还记录
      */
	@Override
	public List<Record2> queryNoReturnedRecords(String uname) {
		return recordDao.queryUserRecordByReturnTime(false, uname);
	}
   /**
    * 查询所有的借还记录
    */
	@Override
	public List<Record2> queryAllRecords() {
		return recordDao.queryAllRecords();
	}

}
