package com.chenshuai.dao.impl;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.chenshuai.dao.BookDao;
import com.chenshuai.entity.Book;
/*
 * �鱾book���ݲ��ʵ����
 * */
public class BookDaoImpl implements BookDao {
    File file=new File("ͼ��.txt");
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
	@Override
	public boolean saveBook(Book book) {
		//����ж� �ļ���Ϊ��
		if(book == null) {
			return false;
		}
		//���ļ��ж�ȡ����
		List<Book> blist =read();
		if(blist.isEmpty()) {
			book.setId(1);
		}else {
			int newid = blist.get(blist.size()-1).getId()+1;
			book.setId(newid);
		}
		blist.add(book);
		return write(blist);
	}
	
   	//��ȡ�鱾������
	private List<Book> read() {
		List<Book> blist = new ArrayList<Book>();
		try {
			//����жϣ�����ļ������ڣ���һ���ļ�
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			ois = new ObjectInputStream(new FileInputStream(file));
			blist = (List<Book>) ois.readObject();
		} catch (FileNotFoundException e) {
			//file.getParentFile().mkdirs();
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(ois!=null) {
				try {
					ois.close();//�ر���Դ
				} catch (IOException e) {	
					e.printStackTrace();
				}
			}
		}
		return blist;
	}
  //��listд���ļ���
	
	private boolean write(List<Book> blist) {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file)); //newһ�����������
			oos.writeObject(blist);//��blist�����ж���д���ļ���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();//�ر���Դ
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}		
		return false;
	}
	
	/**
	 * �޸��鱾
	 */
	
	@Override
	public boolean updateBook(Book book) {
		List<Book> blist =read();
		
		return false;
	}
	
   /**
    * ɾ��ָ��id���鱾
    */
	
	@Override
	public boolean delBook(int bid) {
		List<Book> blist = read();
		for (Book book : blist) {
			if(book.getId() == bid) {
				if(book.getStatus()!=0) {
					blist.remove(bid-1);
					return true;
					//blist.remove(blist.get(bid-1)); //��ָ��λ�õ��鱾ɾ��
				}else {
					System.out.println("ͼ���Ѿ������ȥ��");
				}			
			}
		}
		return write(blist);
	}
	
   /**
    * ��ѯ���е��鱾
    */
	
	@Override
	public List<Book> queryBooks() {
//		List<Book> blist = read(); //��ȡ���뼯����
//		for (Book book : blist) { //�������������е��鱾Ԫ��
//			System.out.println(book);
//		}
		return read();
	}
	
    /**
     * �����鱾�����ֲ����鱾
     */
	@Override
	public Book queryBookByName(String bname) {
		List<Book> blist = read();//��ȡ���뼯����
		for (Book book : blist) {
			if(book.getName().equals(bname)) {
				return book;
			}
		}
		return null;
	}

	
    /**
     * �����鱾��id�����鱾
     */
	@Override
	public Book queryBookById(int bid) {
		List<Book> blist =read();
		for (Book book2 : blist) {
			if(book2.getId() == bid) {
				return book2;
			}
		}
		return null;
	}
   /**
    * �����鱾��״̬�����鱾
    */
	@Override
	public List<Book> queryBookByStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
