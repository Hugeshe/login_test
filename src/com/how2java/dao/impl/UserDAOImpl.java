package com.how2java.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.how2java.dao.UserDAO;
import com.how2java.pojo.User;

public class UserDAOImpl extends HibernateTemplate implements UserDAO {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("dao"+user.getUname()+" "+user.getPwd());
		if(!verifyUname(user.getUname())){
			return false;
		}else{
			save(user);
			return true;
		}
	}

	@Override
	public boolean verifyUname(String uname) {
		// TODO Auto-generated method stub
		System.out.println("dao:"+uname);
		List<User> users = (List<User>) find("from User where uname=?", uname);
		return users.isEmpty();
	}

	@Override
	public boolean verifyPwd(String uname, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("dao:"+uname+" "+pwd);
		List pwds = find("select pwd from User where uname=?", uname);
		return (pwds.get(0).toString()).equals(pwd);
	}

}
