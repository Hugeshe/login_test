package com.how2java.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.how2java.pojo.User;
import com.how2java.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class loginAction extends ActionSupport implements SessionAware {
	private String uname;
	private String pwd;
	
	private Map session;
	private UserService userService;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void validate(){
		super.clearErrorsAndMessages();
		if("".equals(uname)){
			super.addActionError("用户名不能为空！");
		}
		if("".equals(pwd)){
			super.addActionError("密码不能为空！");
		}
	}
	
	public String execute(){
		System.out.println("action:"+uname+" "+pwd);
		if(userService.login(uname, pwd)){
			User user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			session.put("user", user);
			return "success";
		}else{
			super.addActionError("登录失败！");
			return INPUT;
		}
	}
}
