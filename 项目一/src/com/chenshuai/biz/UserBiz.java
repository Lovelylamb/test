package com.chenshuai.biz;

import com.chenshuai.entity.User;

/*
 * 业务层
 * */
public interface UserBiz {
	//用户注册
   boolean register(User user);
	//用户登陆
   User login(String uname,String upassword);
  
   
}
