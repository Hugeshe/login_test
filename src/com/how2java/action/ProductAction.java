package com.how2java.action;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

public class ProductAction {

	ProductService productService;
	List<Product> products;
	Product product;

	public String list() {
		products = productService.list();
		return "listProduct";
	}
	
	public String add(){
		productService.add(product);
		return "listProductAction";
	}
	public String edit(){
		product = productService.get(product.getId());
		return "editProduct";
	}
	public String delete(){
		productService.delete(product);
		return "listProductAction";
	}
	public String update(){
		productService.update(product);
		return "listProductAction";
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	 

}
