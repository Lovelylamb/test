package com.chenshuai.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyUtil {
    private static Scanner input=new Scanner(System.in);
    public static int inputNum(int min,int max) { //����һ�����ֵ��
    	do {
	      	   try {
				int res=input.nextInt();
				   if(res>=min && res<=max) {//�ж��������ֵ�ǲ��ǺϷ�
					   return res;
				   }else {
					   System.err.println("���ݷ�Χ���Ϸ�������������:");
				   }
			} catch (InputMismatchException e) {
				System.err.println("�������Ͳ��Ϸ������������룡");
				input.nextLine();// ��ջ�����
			}
      		
        }while(true);
    }

      
}
