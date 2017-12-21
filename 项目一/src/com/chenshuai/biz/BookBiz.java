package com.chenshuai.biz;

import java.util.List;

import com.chenshuai.entity.Book;

public interface BookBiz {
     public boolean addBook(Book book);//����鱾
     public boolean delBook(int bid);//����idɾ���鱾
     public boolean modifyBook(Book book);//�޸��鱾
     public List<Book> queryBook(); //��ѯ���е��鱾
     public List<Book> queryBookByName(String bname);//�������ֲ�ѯ�鱾
     public Book queryBookById(int bid); //����id��ѯ�鱾
     public int lendBook(int bid,int uid);//��book��ź��û��������
     public int returnBook(int rid);//����Ĺ���
     public List<Book> canLendBook();//�ɽ����
     public List<Book> hasLendedBook(); //���ɽ����
}
