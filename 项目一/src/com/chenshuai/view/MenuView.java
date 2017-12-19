package com.chenshuai.view;

import com.chenshuai.util.MyUtil;

/**
 * 主界面
 * @author Jesus
 *
 */
public class MenuView {
    public static int mainMenu(){
    	System.out.println("***欢迎使用图书馆管理系统***");
    	System.out.println("1==>注册");
    	System.out.println("2==>登录");
		System.out.println("0==>退出");
		System.out.println("请选择:");
		return MyUtil.inputNum(0,2);  //返回的是一个自定义的方法，范围0到2
    }
}
