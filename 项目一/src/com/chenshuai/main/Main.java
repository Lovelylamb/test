package com.chenshuai.main;

import com.chenshuai.view.MenuView;

import java.util.Scanner;

import com.chenshuai.biz.UserBiz;
import com.chenshuai.biz.impl.UserBizImpl;
import com.chenshuai.entity.User;
import com.chenshuai.util.CONSTANTS;

public class Main {
    public static void main(String[] args) {
    	UserBiz userbiz = new UserBizImpl();
    	int choice = MenuView.mainMenu();   //调用选择界面
    	Scanner input =new Scanner(System.in);
    	while(true) {
    		switch(choice){  //用户可用选项
        	//用户注册	
        	case CONSTANTS.USER_REGISTER:     	
        		System.out.println("请输入姓名:");
        		String name = input.next();  //获取名字
        		System.out.println("请输入密码:");
        		String password = input.next(); //获取密码
       		    
        		boolean res = userbiz.register(new User(name,password));//判断是否注册成功
        		if(res) {
        			System.out.println("注册成功"); //注册成功
        			break;
        		}else {
        			System.err.println("注册失败，请重新输入:");//注册失败
        			continue;
        		}
			//用户登陆
        	case CONSTANTS.USER_LOGIN:   
        		System.out.println("请输入姓名:");
        		String uname = input.next();  //登陆的名字
        		System.out.println("请输入密码:");
        		String upassword = input.next(); //登陆的密码
        		User user = userbiz.login(uname, upassword); //输入已注册的用户信息     
                System.out.println(user);
        	    break;   			
    		//用户退出	
    		case CONSTANTS.USER_EXIT:
    			// 退出
    			break;		
        	}   	
    		break;
    	}  		
    }
}
