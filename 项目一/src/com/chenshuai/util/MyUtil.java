package com.chenshuai.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyUtil {
    private static Scanner input=new Scanner(System.in);
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

      
}
