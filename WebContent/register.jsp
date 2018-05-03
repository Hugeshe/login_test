<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h3>注册</h3>
    <s:actionmessage/>
    <span style="color:red"><s:actionerror/></span>
    <form method="post" action="registerAction">
        <span>用户名：</span><input type="text" name="uname" value="${uname}"/><br/>
        <span>密码&nbsp：</span><input type="text" name="pwd" value="${pwd}"/><br/>
        <input type="submit" style="height:25px;width:237px" value="注册" />
    </form>
    <a href="<%=path%>/login.jsp">登录页面</a>
  </body>
</html>
