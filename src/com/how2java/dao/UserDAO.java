package com.how2java.dao;

import com.how2java.pojo.User;

public interface UserDAO {
	public boolean addUser(User user);
	public boolean verifyUname(String uname);
	public boolean verifyPwd(String uname,String pwd);
}
