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
//		Book book1 = new Book("三国演义",5,1,"四大名著之一");
//		Book book2 = new Book("红楼蒙",6,0,"四大名著之一");
//		Book book3 = new Book("西游记",5,0,"四大名著之一");
//		Book book4 = new Book("水浒传",5,1,"四大名著之一");
//		boolean saveBook = bookdao.saveBook(book1);
		BookBiz bookBiz=new BookBizImpl();
		boolean book1=bookBiz.addBook(new Book("三国演义","四大名著","罗贯中",0,1,"这是一本书"));
		boolean book2=bookBiz.addBook(new Book("西游记","四大名著","吴承恩",0,1,"这是一本书"));
		boolean book3=bookBiz.addBook(new Book("水浒传","四大名著","施耐庵",0,1,"这是一本书"));
		boolean book4=bookBiz.addBook(new Book("红楼梦","四大名著","曹雪琴",0,1,"这是一本书"));
		//assertEquals(true,book1);
		List<Book> book=bookBiz.queryBook();
		for (Book b : book) {
			System.out.println(b);
		}
	}
}
