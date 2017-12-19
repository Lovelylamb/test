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
    private File file =new File("user.txt");  //�����ļ�
    private ObjectInputStream ois =null;   //����������
    private ObjectOutputStream oos=null;   //���������
    
	@Override //�����û�
	public boolean saveUser(User user) {
		if(user == null) {
			return false;
		}
		//���ļ��ж������е�User
		List<User> ulist =read();
		//�����û�ID��һ
		if(ulist.isEmpty()) {
			user.setId(1);
		}else {
			int newId = ulist.get(ulist.size()-1).getId()+1;  //���һ��ID���1
			user.setId(newId);
		}
		ulist.add(user);
	
		return write(ulist);	
	}

	
    /**
     * ��user.dat�ļ��ж�ȡ����User
     * @return
     */
	private List<User> read() {
		List<User> ulist = new ArrayList<User>();	
		try {
			ois = new ObjectInputStream(new FileInputStream(file)); //newһ������������
			ulist =(List<User>) ois.readObject();   //����ת��       ���ļ���Ķ�����
		}catch(FileNotFoundException e){    //�ļ��Ҳ����쳣
			//file.getParentFile().mkdirs();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally {
			if(ois!=null) {
				try {
					ois.close(); //�ر���Դ
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return ulist;
	}

	/**
	 * ��Listд���ļ�
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

    //����id�����û�
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

	//�������ֲ����û�
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
