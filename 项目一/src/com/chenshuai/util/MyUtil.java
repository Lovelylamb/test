package com.chenshuai.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.chenshuai.biz.UserBiz;
import com.chenshuai.biz.impl.UserBizImpl;
import com.chenshuai.entity.User;

public class MyUtil {
    private static Scanner input=new Scanner(System.in);
    private static UserBiz userbiz = new UserBizImpl();
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

     //ע�᷽��
    public static void registerUtil() {
		//UserBiz userbiz = new UserBizImpl();
	   //Scanner input =new Scanner(System.in);
		while(true) {
			System.out.println("����������:");
			String name = input.next();  //��ȡ����
			
			System.out.println("����������:");
			String password = input.next(); //��ȡ����     
			
			//������ʽ   �ж�����������Ƿ������ĸ��������
			String regex ="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
			//Ҫ����ȫ�����֣�Ҳ����ȫ����ĸ��Ҫ����ĸ�����ֵ���ϣ�����Ϊ8-16λ֮��
			if(!password.matches(regex)) {
				System.err.println("�����ʽ���Ϸ�������������:");
				continue;
			}
			
			boolean res = userbiz.register(new User(name,password));//�ж��Ƿ�ע��ɹ�
			if(res) {
				    System.out.println("ע��ɹ�"); //ע��ɹ�   
				    //ע����֮��ֱ��ȥ��½
					LoginUtil(); //���õ�½����    			               
				break;
			}else {
				System.err.println("ע��ʧ�ܣ�����������:");//ע��ʧ��				
			}
			if(!isGoOn()) {
				break;
			}
		}
		
	}
    //�û���½����
	public static void LoginUtil() {
		while(true){
			System.out.println("���½:");
			System.out.println("����������:");
			String uname = input.next();  //��½������
			System.out.println("����������:");
			String upassword = input.next(); //��½������          		
			User user = userbiz.login(uname, upassword); //������ע����û���Ϣ     
	        System.out.println(user); 
	        break;
		}				               
	}
	//ѯ���Ƿ����
	public static boolean isGoOn() {
		System.out.println("�����Ƿ�Ҫ����:");
		String choose = input.next();
		if(choose.equals("n") || choose.equals("N")) {
			return false;
		}
		return true;
	}
}
