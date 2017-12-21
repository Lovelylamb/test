package com.chenshuai.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.chenshuai.biz.BookBiz;
import com.chenshuai.biz.impl.BookBizImpl;
import com.chenshuai.entity.Book;

public class Test {

	@org.junit.Test
	public void test() {
//		BookDao  bookdao = new BookDaoImpl();
//		Book book1 = new Book("��������",5,1,"�Ĵ�����֮һ");
//		Book book2 = new Book("��¥��",6,0,"�Ĵ�����֮һ");
//		Book book3 = new Book("���μ�",5,0,"�Ĵ�����֮һ");
//		Book book4 = new Book("ˮ䰴�",5,1,"�Ĵ�����֮һ");
//		boolean saveBook = bookdao.saveBook(book1);
		BookBiz bookBiz=new BookBizImpl();
		boolean book1=bookBiz.addBook(new Book("��������","�Ĵ�����","�޹���",0,1,"����һ����"));
		boolean book2=bookBiz.addBook(new Book("���μ�","�Ĵ�����","��ж�",0,1,"����һ����"));
		boolean book3=bookBiz.addBook(new Book("ˮ䰴�","�Ĵ�����","ʩ����",0,1,"����һ����"));
		boolean book4=bookBiz.addBook(new Book("��¥��","�Ĵ�����","��ѩ��",0,1,"����һ����"));
		//assertEquals(true,book1);
		List<Book> book=bookBiz.queryBook();
		for (Book b : book) {
			System.out.println(b);
		}
	}
}
