package com.chenshuai.biz.impl;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 业务层实现类
 */
import java.util.List;

import com.chenshuai.biz.BookBiz;
import com.chenshuai.dao.BookDao;
import com.chenshuai.dao.RecordDao;
import com.chenshuai.dao.impl.BookDaoImpl;
import com.chenshuai.dao.impl.RecordDaoImpl;
import com.chenshuai.entity.Book;
import com.chenshuai.entity.Record;

import jdk.management.resource.internal.inst.SimpleAsynchronousFileChannelImplRMHooks;

public class BookBizImpl implements BookBiz {
    private BookDao bookDao = new BookDaoImpl();
    private RecordDao  recordDao  =new RecordDaoImpl();
    /**
     * 添加书本的业务
     */
	@Override
	public boolean addBook(Book book) {		
		return bookDao.saveBook(book);//调用dao层里面的savebook方法
	}
	/**
	 * 删除书本
	 */
	@Override
	public boolean delBook(int bid) {		
		return bookDao.delBook(bid);
	}
    /**
     * 修改书本的数据
     */
	@Override
	public boolean modifyBook(Book book) {		
		return bookDao.updateBook(book);
	}
	/**
	 * 查询所有的书本
	 */
	@Override
	public List<Book> queryBook() {	
		return bookDao.queryBooks();
	}
    /**
     * 根据书名查找书本
     */
	@Override
	public List<Book> queryBookByName(String bname) {	
		return (List<Book>) bookDao.queryBookByName(bname);
	}
    /**
     * 根据书本的id查找书本
     */
	@Override
	public Book queryBookById(int bid) {	
		return bookDao.queryBookById(bid);
	}
    /**
     * 通过书本id来实现借书功能
     */
	@Override
	public int lendBook(int bid, int uid) {
		//通过书本的id查询是否哟这本书
		Book book = bookDao.queryBookById(bid);
		if(book == null) {
			System.out.println("没有找到对应的书");
			return 0;//没有找到要借的书本
		}else {
			if(book.getStatus()==0) {
				System.out.println("书本已借出");
				return 1;  //不可借
			}else {
				book.setStatus(0);//更新状态，代表已经借出
				boolean flag = bookDao.updateBook(book);
				Record record =new Record(uid, book.getId(), new SimpleDateFormat("yyyy-MM-dd").format(new Date()), null);
			    boolean flag1 = recordDao.saveRecord(record); //调用记录中的保存方法 保存借书的信息
			    if(flag1 && flag) {
			    	System.out.println("借出成功！");
			    	return 2;
			    }else {
			    	System.out.println("借出失败！");
			    	return 3;
			    }
			}
		}
	}
    /**
     * 还书的功能
     */
	@Override
	public int returnBook(int rid) {
		Record record = recordDao.queryRecordById(rid);
		if(record==null) {
			System.out.println("没有借书记录！");
			return 0;   //输入不正确
		}else if(record.getReturnTime()!=null){
			System.out.println("书本已经归还，不能重复归还！");
			return 1;
		}else {
			//如果书本没有归还，设置归还时间
			record.setReturnTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		    boolean flag = recordDao.updateRecord(record);//更新记录表
		    Book book = bookDao.queryBookById(record.getBid());//找到对应的书本，更新书本的状态
		    book.setStatus(1);// 可借状态
		    boolean flag1 = bookDao.updateBook(book); //更新书本
		    if(flag && flag1) {
		    	System.out.println("归还成功！");
		    	return 2;
		    }else {
		    	System.out.println("归还失败！");
		        return 3;
		    }
		}
	}
    
	@Override
	public List<Book> canLendBook() {
		
		return bookDao.queryBookByStatus(1);
	}

	@Override
	public List<Book> hasLendedBook() {
		
		return bookDao.queryBookByStatus(0);
	}

}
