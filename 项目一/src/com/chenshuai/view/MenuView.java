package com.chenshuai.view;

import com.chenshuai.util.MyUtil;

/**
 * ������
 * @author Jesus
 *
 */
public class MenuView {
   //��½ע�����
	public static int mainMenu(){
    	System.out.println("***��ӭʹ��ͼ��ݹ���ϵͳ***");
    	System.out.println("1==>ע��");
    	System.out.println("2==>��¼");
		System.out.println("0==>�˳�");
		System.out.print("��ѡ��:");
		return MyUtil.inputNum(0,2);  //���ص���һ���Զ���ķ�������Χ0��2
    }
    //���ͼ�����
    public static int browseBook() {
    	System.out.println("***���ͼ��***");
    	System.out.println("1==>����ͽ���");
    	System.out.println("2==>����");  	
    	System.out.println("3==>����ͼ����ڿ�״̬");
    	System.out.println("0==>������һ��");
    	System.out.print("��ѡ��:");
		return MyUtil.inputNum(0,3);
    }
    //�������
    public static int brrowBook() {
    	System.out.println("***����ͼ��***");
    	System.out.println("1==>id��ѯ");
    	System.out.println("2==>name��ѯ");
    	System.out.println("3==>״̬��ѯ");
    	System.out.println("0==>������һ��");
		return MyUtil.inputNum(0,3);
    }
    //�������
    public static int returnBook() {
    	System.out.println("***ͼ���˻�***");
    	System.out.println("1==>�����¼");
    	System.out.println("2==>");
    	System.out.println("3==>");
    	System.out.println("0==>������һ��");
		return MyUtil.inputNum(0,3);
    }  
}
