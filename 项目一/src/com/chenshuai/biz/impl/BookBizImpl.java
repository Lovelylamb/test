package com.chenshuai.biz.impl;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ҵ���ʵ����
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
     * ����鱾��ҵ��
     */
	@Override
	public boolean addBook(Book book) {		
		return bookDao.saveBook(book);//����dao�������savebook����
	}
	/**
	 * ɾ���鱾
	 */
	@Override
	public boolean delBook(int bid) {		
		return bookDao.delBook(bid);
	}
    /**
     * �޸��鱾������
     */
	@Override
	public boolean modifyBook(Book book) {		
		return bookDao.updateBook(book);
	}
	/**
	 * ��ѯ���е��鱾
	 */
	@Override
	public List<Book> queryBook() {	
		return bookDao.queryBooks();
	}
    /**
     * �������������鱾
     */
	@Override
	public List<Book> queryBookByName(String bname) {	
		return (List<Book>) bookDao.queryBookByName(bname);
	}
    /**
     * �����鱾��id�����鱾
     */
	@Override
	public Book queryBookById(int bid) {	
		return bookDao.queryBookById(bid);
	}
    /**
     * ͨ���鱾id��ʵ�ֽ��鹦��
     */
	@Override
	public int lendBook(int bid, int uid) {
		//ͨ���鱾��id��ѯ�Ƿ�Ӵ�Ȿ��
		Book book = bookDao.queryBookById(bid);
		if(book == null) {
			System.out.println("û���ҵ���Ӧ����");
			return 0;//û���ҵ�Ҫ����鱾
		}else {
			if(book.getStatus()==0) {
				System.out.println("�鱾�ѽ��");
				return 1;  //���ɽ�
			}else {
				book.setStatus(0);//����״̬�������Ѿ����
				boolean flag = bookDao.updateBook(book);
				Record record =new Record(uid, book.getId(), new SimpleDateFormat("yyyy-MM-dd").format(new Date()), null);
			    boolean flag1 = recordDao.saveRecord(record); //���ü�¼�еı��淽�� ����������Ϣ
			    if(flag1 && flag) {
			    	System.out.println("����ɹ���");
			    	return 2;
			    }else {
			    	System.out.println("���ʧ�ܣ�");
			    	return 3;
			    }
			}
		}
	}
    /**
     * ����Ĺ���
     */
	@Override
	public int returnBook(int rid) {
		Record record = recordDao.queryRecordById(rid);
		if(record==null) {
			System.out.println("û�н����¼��");
			return 0;   //���벻��ȷ
		}else if(record.getReturnTime()!=null){
			System.out.println("�鱾�Ѿ��黹�������ظ��黹��");
			return 1;
		}else {
			//����鱾û�й黹�����ù黹ʱ��
			record.setReturnTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		    boolean flag = recordDao.updateRecord(record);//���¼�¼��
		    Book book = bookDao.queryBookById(record.getBid());//�ҵ���Ӧ���鱾�������鱾��״̬
		    book.setStatus(1);// �ɽ�״̬
		    boolean flag1 = bookDao.updateBook(book); //�����鱾
		    if(flag && flag1) {
		    	System.out.println("�黹�ɹ���");
		    	return 2;
		    }else {
		    	System.out.println("�黹ʧ�ܣ�");
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
