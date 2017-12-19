package com.chenshuai.dao;

import com.chenshuai.entity.User;

/*
 * �û������ݷ��ʲ�
 * */
public interface UserDao {
    public boolean saveUser(User user);//����û�
    public boolean delUser(int id); //�����û�ID�����û��˺�
    public boolean updateUser(User user);//�����û���Ϣ
    public User queryUser(User user); //�����û���Ϣ
    public User queryUserById(int uid);//�����û�id�����û�
    public User queryUserByName(String uname);//�����û������������û�
}
