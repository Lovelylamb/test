package com.chenshuai.dao;

import java.util.List;

import com.chenshuai.entity.Book;
/*
 * 书本的数据访问层
 * */
public interface BookDao {
    public boolean saveBook(Book book);  //添加书本
    public boolean updateBook(Book book);//更新书本
    public boolean delBook(int bid); //根据书本的id删除书本
    public List<Book> queryBooks(); //查询所有的书本
    public List<Book> queryBookByName(String bname);//查找指定名字的书本
    public List<Book> querySortBookByLimit(int index,int number);//查找指定位置的，指定个数的书本
    public List<Book> queryBookById(int did);//根据指定的ID来查找书本
    public List<Book> queryBookByStatus(int status);//根据书本的Status来查找书本
}
