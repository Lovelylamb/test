package com.chenshuai.view;

import com.chenshuai.util.MyUtil;

/**
 * ������
 * @author Jesus
 *
 */
public class MenuView {
    public static int mainMenu(){
    	System.out.println("***��ӭʹ��ͼ��ݹ���ϵͳ***");
    	System.out.println("1==>ע��");
    	System.out.println("2==>��¼");
		System.out.println("0==>�˳�");
		System.out.println("��ѡ��:");
		return MyUtil.inputNum(0,2);  //���ص���һ���Զ���ķ�������Χ0��2
    }
}
