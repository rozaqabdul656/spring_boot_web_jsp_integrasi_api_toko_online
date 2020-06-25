package com.main.dao;

import java.util.List;

import com.main.model.Product;

public interface DaoProduct {
	Product insertProduct(Product Pr);
	Product updateProduct(Product Pr);
	
	List<Product> getAllProduct();
	List<Product> getDetailAllProduct(int id);
	//get By Id
	public Product getFindOne(Long id);
		
}
