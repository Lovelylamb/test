package com.chenshuai.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.chenshuai.biz.UserBiz;
import com.chenshuai.biz.impl.UserBizImpl;
import com.chenshuai.entity.User;

public class MyUtil {
    private static Scanner input=new Scanner(System.in);
    private static UserBiz userbiz = new UserBizImpl();
    public static int inputNum(int min,int max) { //定义一个最大值和
    	do {
	      	   try {
				int res=input.nextInt();
				   if(res>=min && res<=max) {//判断输入的数值是不是合法
					   return res;
				   }else {
					   System.err.println("数据范围不合法，请重新输入:");
				   }
			} catch (InputMismatchException e) {
				System.err.println("数据类型不合法，请重新输入！");
				input.nextLine();// 清空缓冲区
			}
      		
        }while(true);
    }

     //注册方法
    public static void registerUtil() {
		//UserBiz userbiz = new UserBizImpl();
	   //Scanner input =new Scanner(System.in);
		while(true) {
			System.out.println("请输入姓名:");
			String name = input.next();  //获取名字
			
			System.out.println("请输入密码:");
			String password = input.next(); //获取密码     
			
			//正则表达式   判断输入的密码是否包含字母或者数字
			String regex ="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
			//要求不能全是数字，也不能全是字母，要是字母和数字的组合，长度为8-16位之间
			if(!password.matches(regex)) {
				System.err.println("密码格式不合法，请重新输入:");
				continue;
			}
			
			boolean res = userbiz.register(new User(name,password));//判断是否注册成功
			if(res) {
				    System.out.println("注册成功"); //注册成功   
				    //注册完之后直接去登陆
					LoginUtil(); //调用登陆方法    			               
				break;
			}else {
				System.err.println("注册失败，请重新输入:");//注册失败				
			}
			if(!isGoOn()) {
				break;
			}
		}
		
	}
    //用户登陆方法
	public static void LoginUtil() {
		while(true){
			System.out.println("请登陆:");
			System.out.println("请输入姓名:");
			String uname = input.next();  //登陆的名字
			System.out.println("请输入密码:");
			String upassword = input.next(); //登陆的密码          		
			User user = userbiz.login(uname, upassword); //输入已注册的用户信息     
	        System.out.println(user); 
	        break;
		}				               
	}
	//询问是否继续
	public static boolean isGoOn() {
		System.out.println("请问是否要继续:");
		String choose = input.next();
		if(choose.equals("n") || choose.equals("N")) {
			return false;
		}
		return true;
	}
}
