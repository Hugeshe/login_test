package com.how2java.action;

import java.util.Map;

import com.how2java.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class registerAction extends ActionSupport {
	private String uname;
	private String pwd;
	
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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void validate(){
		super.clearErrorsAndMessages();
		if("".equals(uname)){
			super.addActionError("�û�������Ϊ�գ�");
		}
		if("".equals(pwd)){
			super.addActionError("���벻��Ϊ�գ�");
		}
	}
	
	public String execute(){
		System.out.println("action:"+uname+" "+pwd);
		if(userService.register(uname, pwd)){
			super.addActionMessage("ע��ɹ�");
		}else{
			super.addActionError("ע��ʧ�ܣ����û����Ѵ���");
		}
		return "success";
	}
}
