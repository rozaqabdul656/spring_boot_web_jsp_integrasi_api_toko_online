package com.main.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.DaoJenisProduct;
import com.main.model.JenisProduct;
import com.main.repository.RepositoryJenisProduct;

@Service
public class JenisProductImp implements DaoJenisProduct {

	@Autowired
	RepositoryJenisProduct Rjp ;
	
	
	@Override
	public void insertProduct(JenisProduct Pr) {
		Rjp.save(Pr);
	}

	@Override
	public List<JenisProduct> getAllProduct() {
		
		return Rjp.findAll();
	}

	@Override
	public JenisProduct getDetailAllProduct(long id) {
	 return Rjp.findOne(id);
	}

	@Override
	public void updateProduct(JenisProduct Pr) {
		Rjp.save(Pr);
		
	}

	@Override
	public void deleteJenis(Long Id) {
		Rjp.delete(Id);
		
	}

}
