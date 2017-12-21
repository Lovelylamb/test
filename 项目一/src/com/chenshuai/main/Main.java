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
		 * �û���½ע�����
		 */
		Scanner input = new Scanner(System.in);
		//UserBiz userbiz = new UserBizImpl();
		//int choice = MenuView.mainMenu(); // ����ѡ�����
		
		System.out.println("***��ӭʹ��ͼ��ݹ���ϵͳ***");
    	System.out.println("1==>ע��");
    	System.out.println("2==>��¼");
		System.out.println("0==>�˳�");
		System.out.print("��ѡ��:");
		int  choice = input.nextInt();
		while (true) {
			switch (choice) {
			case 1: // �û�ע��
				MyUtil.registerUtil();
				break;
			case 2: // �û���½
				MyUtil.LoginUtil();
				break;
			case 0: // �û��˳� 
				break;
			}
			break;
		}
		/**
		 * �û�ѡ�����
		 */
		System.out.println("***���ͼ��***");
    	System.out.println("1==>����ͽ���");
    	System.out.println("2==>����");  	
    	System.out.println("3==>����ͼ����ڿ�״̬");
    	System.out.println("0==>������һ��");
    	System.out.print("��ѡ��:");
		BookBiz bookbiz = new BookBizImpl();
		int choice2 = MenuView.browseBook(); // ����ͼ���������
		switch (choice2) {		
		case 1:        // �鿴���е��鼮
			List<Book> book = bookbiz.queryBook();// ��ѯ���е��鼮
			for (Book book2 : book) {
				System.out.println(book2);
			}
			break;
		case 2:       //�����鼮
			MenuView.brrowBook();
			break;
		case 3:
			break;
		case 0:{
			return ;
		}           
	}
		
		/**
		 * �鼮���Ľ���
		 */
	    System.out.println("***�鿴�ͽ���ͼ��***");
	    System.out.println("1==>id��ѯ");
	    System.out.println("2==>name��ѯ");
	    System.out.println("3==>״̬��ѯ");
	    System.out.println("0==>������һ��");
		int choice3 = MenuView.brrowBook();
		switch(choice3) {
		case 1:
			 MenuView.returnBook();
		}
	}
}
