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
    	int choice = MenuView.mainMenu();   //����ѡ�����
    	Scanner input =new Scanner(System.in);
    	while(true) {
    		switch(choice){  //�û�����ѡ��
        	//�û�ע��	
        	case CONSTANTS.USER_REGISTER:     	
        		System.out.println("����������:");
        		String name = input.next();  //��ȡ����
        		System.out.println("����������:");
        		String password = input.next(); //��ȡ����
       		    
        		boolean res = userbiz.register(new User(name,password));//�ж��Ƿ�ע��ɹ�
        		if(res) {
        			System.out.println("ע��ɹ�"); //ע��ɹ�
        			break;
        		}else {
        			System.err.println("ע��ʧ�ܣ�����������:");//ע��ʧ��
        			continue;
        		}
			//�û���½
        	case CONSTANTS.USER_LOGIN:   
        		System.out.println("����������:");
        		String uname = input.next();  //��½������
        		System.out.println("����������:");
        		String upassword = input.next(); //��½������
        		User user = userbiz.login(uname, upassword); //������ע����û���Ϣ     
                System.out.println(user);
        	    break;   			
    		//�û��˳�	
    		case CONSTANTS.USER_EXIT:
    			// �˳�
    			break;		
        	}   	
    		break;
    	}  		
    }
}
