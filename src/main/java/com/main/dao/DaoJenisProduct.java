package com.main.dao;

import java.util.List;

import com.main.model.JenisProduct;


public interface DaoJenisProduct {
	void insertProduct(JenisProduct Pr);
	List<JenisProduct> getAllProduct();
	List<JenisProduct> getDetailAllProduct(int id);
	
}
