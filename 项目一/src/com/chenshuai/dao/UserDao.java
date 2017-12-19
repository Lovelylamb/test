package com.chenshuai.dao;

import com.chenshuai.entity.User;

/*
 * 用户的数据访问层
 * */
public interface UserDao {
    public boolean saveUser(User user);//添加用户
    public boolean delUser(int id); //根据用户ID冻结用户账号
    public boolean updateUser(User user);//更新用户信息
    public User queryUser(User user); //查找用户信息
    public User queryUserById(int uid);//根据用户id查找用户
    public User queryUserByName(String uname);//根据用户名字来查找用户
}
