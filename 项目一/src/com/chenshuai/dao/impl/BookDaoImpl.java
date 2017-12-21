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
 * 书本book数据层的实现类
 * */
public class BookDaoImpl implements BookDao {
    File file=new File("图书.txt");
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
	@Override
	public boolean saveBook(Book book) {
		//入参判断 文件中为空
		if(book == null) {
			return false;
		}
		//从文件中读取内容
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
	
   	//读取书本的内容
	private List<Book> read() {
		List<Book> blist = new ArrayList<Book>();
		try {
			//入参判断，如果文件不存在，建一个文件
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
					ois.close();//关闭资源
				} catch (IOException e) {	
					e.printStackTrace();
				}
			}
		}
		return blist;
	}
  //将list写到文件中
	
	private boolean write(List<Book> blist) {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file)); //new一个对象输出流
			oos.writeObject(blist);//将blist集合中东西写到文件中
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();//关闭资源
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}		
		return false;
	}
	
	/**
	 * 修改书本
	 */
	
	@Override
	public boolean updateBook(Book book) {
		List<Book> blist =read();
		
		return false;
	}
	
   /**
    * 删除指定id的书本
    */
	
	@Override
	public boolean delBook(int bid) {
		List<Book> blist = read();
		for (Book book : blist) {
			if(book.getId() == bid) {
				if(book.getStatus()!=0) {
					blist.remove(bid-1);
					return true;
					//blist.remove(blist.get(bid-1)); //将指定位置的书本删除
				}else {
					System.out.println("图书已经被借出去！");
				}			
			}
		}
		return write(blist);
	}
	
   /**
    * 查询所有的书本
    */
	
	@Override
	public List<Book> queryBooks() {
//		List<Book> blist = read(); //读取放入集合中
//		for (Book book : blist) { //遍历集合中所有的书本元素
//			System.out.println(book);
//		}
		return read();
	}
	
    /**
     * 根据书本的名字查找书本
     */
	@Override
	public Book queryBookByName(String bname) {
		List<Book> blist = read();//读取放入集合中
		for (Book book : blist) {
			if(book.getName().equals(bname)) {
				return book;
			}
		}
		return null;
	}

	
    /**
     * 根据书本的id查找书本
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
    * 根据书本的状态查找书本
    */
	@Override
	public List<Book> queryBookByStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
