package com.chenshuai.biz;

import com.chenshuai.entity.User;

/*
 * ҵ���
 * */
public interface UserBiz {
	//�û�ע��
   boolean register(User user);
	//�û���½
   User login(String uname,String upassword);
  
   
}
