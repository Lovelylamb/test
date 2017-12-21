package com.chenshuai.biz.impl;

import com.chenshuai.biz.UserBiz;
import com.chenshuai.dao.UserDao;
import com.chenshuai.dao.impl.UserDaoImpl;
import com.chenshuai.entity.User;
import com.chenshuai.util.MyUtil;

public class UserBizImpl implements UserBiz {
    private UserDao userDao = new UserDaoImpl();
    //�û�ע��
	@Override
	public boolean register(User user) {
		if(user == null) {  //����û�Ϊ��
			return false;
		}
		//�����û����ֲ�ѯ
		User u =userDao.queryUserByName(user.getName());
		if(u==null) {  //�û���������
			return userDao.saveUser(user);
		}else {
			System.out.println("�û����Ѵ���");
		}
       /*//�����û�id��ѯ
		User u1 = userDao.queryUserById(user.getId());
		if(u1 == null) {
			return userDao.saveUser(user);
		}else {
			System.out.println("�û���id�Ѵ���");
		}*/
		return false;
	}
   //�û���½
	@Override
	public User login(String uname, String upassword) {
			if(uname == null || upassword == null) {
				return null;
			}

			User u =userDao.queryUserByName(uname);
			if(u == null) {
				System.err.println("�û������������");// �û���
	            
			}else {
				if(u.getPassword().equals(upassword)){
					System.out.println("��½�ɹ�!");
					return u;						
				}				
		   }
		return null;	
   }
}
