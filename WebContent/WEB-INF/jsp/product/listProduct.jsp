<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<div style="margin:0px auto; width:500px">
<table cellspacing="0" border="1" width="100%">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>编辑</td>
		<td>删除</td>
		
	</tr>
	    	    
<s:iterator value="products" var="p">
	<tr>
		<td>${p.id}</td>
		<td>${p.name}</td>
		<td><a href="editProduct?product.id=${p.id}">编辑</a></td>
		<td><a href="deleteProduct?product.id=${p.id}">删除</a></td>		
	</tr>
</s:iterator>

</table>

<br>
<br>

<form action="addProduct" method="post">

name: <input name="product.name"> <br>
<button type="submit">提交</button>

</form>
</div>