package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;

	public List<Product> list() {
		List<Product> products= productDAO.list();
		if(products.isEmpty()){
			for (int i = 0; i < 5; i++) {
				Product p = new Product();
				p.setName("product " + i);
				productDAO.add(p);
				products.add(p);
			}
		}
		return products;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public void add(Product p) {
		productDAO.add(p);
		
	}



	@Override
	public void update(Product p) {
		productDAO.update(p);
	}

	@Override
	public void delete(Product p) {
		productDAO.delete(p);
	}

	@Override
	public Product get(int id) {
		return productDAO.get(id);
	}

	
}
