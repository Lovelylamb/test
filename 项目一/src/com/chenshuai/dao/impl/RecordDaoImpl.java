package com.chenshuai.dao.impl;

import java.util.List;

import com.chenshuai.dao.RecordDao;
import com.chenshuai.entity.Record;
import com.chenshuai.entity.Record2;

public class RecordDaoImpl implements RecordDao {
    
	@Override
	public Record queryRecordById(int rid) {	
		return null;
	}

	@Override
	public boolean saveRecord(Record record) {
		return false;
	}

	@Override
	public boolean updateRecord(Record record) {
		return false;
	}

	@Override
	public List<Record2> queryAllRecords() {
		return null;
	}

	@Override
	public List<Record2> queryRecordByUname(String uname) {
		return null;
	}

	@Override
	public List<Record2> queryRecordByBname(String bname) {
		return null;
	}

	@Override
	public List<Record2> queryUserRecordByReturnTime(boolean flag, String name) {
		return null;
	}

}
