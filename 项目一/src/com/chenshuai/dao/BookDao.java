package com.chenshuai.dao;

import java.util.List;

import com.chenshuai.entity.Book;
/*
 * �鱾�����ݷ��ʲ�
 * */
public interface BookDao {
    public boolean saveBook(Book book);  //����鱾
    public boolean updateBook(Book book);//�����鱾
    public boolean delBook(int bid); //�����鱾��idɾ���鱾
    public List<Book> queryBooks(); //��ѯ���е��鱾
    public List<Book> queryBookByName(String bname);//����ָ�����ֵ��鱾
    public List<Book> querySortBookByLimit(int index,int number);//����ָ��λ�õģ�ָ���������鱾
    public List<Book> queryBookById(int did);//����ָ����ID�������鱾
    public List<Book> queryBookByStatus(int status);//�����鱾��Status�������鱾
}
