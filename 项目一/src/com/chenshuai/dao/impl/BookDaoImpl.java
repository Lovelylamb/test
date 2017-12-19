package com.chenshuai.dao.impl;

import java.util.List;

import com.chenshuai.dao.BookDao;
import com.chenshuai.entity.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public boolean saveBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delBook(int bid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> queryBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> queryBookByName(String bname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> querySortBookByLimit(int index, int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> queryBookById(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> queryBookByStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}

}
