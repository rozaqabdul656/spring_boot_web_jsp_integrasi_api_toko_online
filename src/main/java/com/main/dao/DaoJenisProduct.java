package com.main.dao;

import java.util.List;

import com.main.model.JenisProduct;


public interface DaoJenisProduct {
	void insertProduct(JenisProduct Pr);
	void updateProduct(JenisProduct Pr);
	void deleteJenis(Long Id);
	
	
	List<JenisProduct> getAllProduct();
	JenisProduct getDetailAllProduct(long id);
	
}
