package com.chenshuai.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.chenshuai.dao.UserDao;
import com.chenshuai.entity.User;

public class UserDaoImpl implements UserDao {
    private File file =new File("user.txt");  //定义文件
    private ObjectInputStream ois =null;   //对象输入流
    private ObjectOutputStream oos=null;   //对象输出流
    
	@Override //增加用户
	public boolean saveUser(User user) {
		if(user == null) {
			return false;
		}
		//从文件中读出所有的User
		List<User> ulist =read();
		//新增用户ID加一
		if(ulist.isEmpty()) {
			user.setId(1);
		}else {
			int newId = ulist.get(ulist.size()-1).getId()+1;  //最后一个ID后加1
			user.setId(newId);
		}
		ulist.add(user);
	
		return write(ulist);	
	}

	
    /**
     * 从user.dat文件中读取所有User
     * @return
     */
	private List<User> read() {
		List<User> ulist = new ArrayList<User>();	
		try {
			ois = new ObjectInputStream(new FileInputStream(file)); //new一个对象输入流
			ulist =(List<User>) ois.readObject();   //向下转型       把文件里的读出来
		}catch(FileNotFoundException e){    //文件找不到异常
			//file.getParentFile().mkdirs();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally {
			if(ois!=null) {
				try {
					ois.close(); //关闭资源
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return ulist;
	}

	/**
	 * 将List写到文件
	 * @param ulist
	 * @return
	 */
	private boolean write(List<User> ulist) {
	    try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(ulist);
			return true;
		} catch (IOException e) {	
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	   
		return false;
	}
	
	
	
	@Override
	public boolean delUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

    //根据id查找用户
	@Override
	public User queryUserById(int uid) {
		List<User> ulist = read();
		for(User user:ulist) {
			if(user.getId()==uid) {
				return user;
			}
		}
		return null;
	}

	//根据名字查找用户
	@Override 
	public User queryUserByName(String uname) {
		List<User> ulist = read();
		for(User user :ulist) {
			if(user.getName().equals(uname)) {
			  return user;
			}
		}
		return null;
	}	

}
