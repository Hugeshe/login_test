package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Product;

public interface ProductService {
	
	public List<Product> list();
	public void add(Product p);
	public Product get(int id);
	public void update(Product p);
	public void delete(Product p);
}
