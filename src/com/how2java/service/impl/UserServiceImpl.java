package com.how2java.service.impl;

import com.how2java.dao.UserDAO;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean login(String uname, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("service:"+uname+" "+pwd);
		if(!userDAO.verifyUname(uname)){
			return userDAO.verifyPwd(uname, pwd);
		}else{
			return false;
		}
	}

	@Override
	public boolean register(String uname, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("service:"+uname+" "+pwd);
		User user = new User();
		user.setUname(uname);
		user.setPwd(pwd);
		return userDAO.addUser(user);
	}

}
