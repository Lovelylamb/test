package com.chenshuai.view;

import com.chenshuai.util.MyUtil;

/**
 * 主界面
 * @author Jesus
 *
 */
public class MenuView {
   //登陆注册界面
	public static int mainMenu(){
    	System.out.println("***欢迎使用图书馆管理系统***");
    	System.out.println("1==>注册");
    	System.out.println("2==>登录");
		System.out.println("0==>退出");
		System.out.print("请选择:");
		return MyUtil.inputNum(0,2);  //返回的是一个自定义的方法，范围0到2
    }
    //浏览图书界面
    public static int browseBook() {
    	System.out.println("***浏览图书***");
    	System.out.println("1==>浏览和借书");
    	System.out.println("2==>还书");  	
    	System.out.println("3==>所有图书的在库状态");
    	System.out.println("0==>返回上一级");
    	System.out.print("请选择:");
		return MyUtil.inputNum(0,3);
    }
    //借书界面
    public static int brrowBook() {
    	System.out.println("***借阅图书***");
    	System.out.println("1==>id查询");
    	System.out.println("2==>name查询");
    	System.out.println("3==>状态查询");
    	System.out.println("0==>返回上一级");
		return MyUtil.inputNum(0,3);
    }
    //还书界面
    public static int returnBook() {
    	System.out.println("***图书退还***");
    	System.out.println("1==>借书记录");
    	System.out.println("2==>");
    	System.out.println("3==>");
    	System.out.println("0==>返回上一级");
		return MyUtil.inputNum(0,3);
    }  
}
