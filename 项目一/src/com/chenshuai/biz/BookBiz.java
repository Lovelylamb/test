package com.chenshuai.biz;

import java.util.List;

import com.chenshuai.entity.Book;

public interface BookBiz {
     public boolean addBook(Book book);//添加书本
     public boolean delBook(int bid);//更具id删除书本
     public boolean modifyBook(Book book);//修改书本
     public List<Book> queryBook(); //查询所有的书本
     public List<Book> queryBookByName(String bname);//根据名字查询书本
     public Book queryBookById(int bid); //根据id查询书本
     public int lendBook(int bid,int uid);//按book编号和用户编号租书
     public int returnBook(int rid);//还书的功能
     public List<Book> canLendBook();//可借的书
     public List<Book> hasLendedBook(); //不可借的书
}
