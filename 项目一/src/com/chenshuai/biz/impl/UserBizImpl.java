package com.chenshuai.biz.impl;

import com.chenshuai.biz.UserBiz;
import com.chenshuai.dao.UserDao;
import com.chenshuai.dao.impl.UserDaoImpl;
import com.chenshuai.entity.User;
import com.chenshuai.util.MyUtil;

public class UserBizImpl implements UserBiz {
    private UserDao userDao = new UserDaoImpl();
    //用户注册
	@Override
	public boolean register(User user) {
		if(user == null) {  //如果用户为空
			return false;
		}
		//根据用户名字查询
		User u =userDao.queryUserByName(user.getName());
		if(u==null) {  //用户名不存在
			return userDao.saveUser(user);
		}else {
			System.out.println("用户名已存在");
		}
       /*//根据用户id查询
		User u1 = userDao.queryUserById(user.getId());
		if(u1 == null) {
			return userDao.saveUser(user);
		}else {
			System.out.println("用户名id已存在");
		}*/
		return false;
	}
   //用户登陆
	@Override
	public User login(String uname, String upassword) {
			if(uname == null || upassword == null) {
				return null;
			}

			User u =userDao.queryUserByName(uname);
			if(u == null) {
				System.err.println("用户名或密码错误");// 用户名
	            
			}else {
				if(u.getPassword().equals(upassword)){
					System.out.println("登陆成功!");
					return u;						
				}				
		   }
		return null;	
   }
}
