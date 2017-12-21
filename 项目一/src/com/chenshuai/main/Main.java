package com.chenshuai.main;

import java.util.List;
import java.util.Scanner;
import com.chenshuai.biz.BookBiz;
import com.chenshuai.biz.UserBiz;
import com.chenshuai.biz.impl.BookBizImpl;
import com.chenshuai.biz.impl.UserBizImpl;
import com.chenshuai.entity.Book;
import com.chenshuai.entity.User;
import com.chenshuai.util.MyUtil;
import com.chenshuai.view.MenuView;

public class Main {
	public static void main(String[] args) {
		/**
		 * 用户登陆注册界面
		 */
		Scanner input = new Scanner(System.in);
		//UserBiz userbiz = new UserBizImpl();
		//int choice = MenuView.mainMenu(); // 调用选择界面
		
		System.out.println("***欢迎使用图书馆管理系统***");
    	System.out.println("1==>注册");
    	System.out.println("2==>登录");
		System.out.println("0==>退出");
		System.out.print("请选择:");
		int  choice = input.nextInt();
		while (true) {
			switch (choice) {
			case 1: // 用户注册
				MyUtil.registerUtil();
				break;
			case 2: // 用户登陆
				MyUtil.LoginUtil();
				break;
			case 0: // 用户退出 
				break;
			}
			break;
		}
		/**
		 * 用户选择界面
		 */
		System.out.println("***浏览图书***");
    	System.out.println("1==>浏览和借书");
    	System.out.println("2==>还书");  	
    	System.out.println("3==>所有图书的在库状态");
    	System.out.println("0==>返回上一级");
    	System.out.print("请选择:");
		BookBiz bookbiz = new BookBizImpl();
		int choice2 = MenuView.browseBook(); // 调用图书浏览界面
		switch (choice2) {		
		case 1:        // 查看所有的书籍
			List<Book> book = bookbiz.queryBook();// 查询所有的书籍
			for (Book book2 : book) {
				System.out.println(book2);
			}
			break;
		case 2:       //借阅书籍
			MenuView.brrowBook();
			break;
		case 3:
			break;
		case 0:{
			return ;
		}           
	}
		
		/**
		 * 书籍借阅界面
		 */
	    System.out.println("***查看和借阅图书***");
	    System.out.println("1==>id查询");
	    System.out.println("2==>name查询");
	    System.out.println("3==>状态查询");
	    System.out.println("0==>返回上一级");
		int choice3 = MenuView.brrowBook();
		switch(choice3) {
		case 1:
			 MenuView.returnBook();
		}
	}
}
