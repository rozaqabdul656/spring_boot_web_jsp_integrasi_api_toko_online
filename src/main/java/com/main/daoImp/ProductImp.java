package com.main.daoImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import com.google.gson.Gson;
import com.main.dao.DaoProduct;
import com.main.model.JenisProduct;
import com.main.model.Product;
import com.main.repository.RepositoryJenisProduct;
import com.main.repository.RepositoryProduct;

@Service
public class ProductImp implements DaoProduct {
	
	@Autowired
	RepositoryProduct Rp ;
	
	@Override
	public List<Product> getAllProduct() {
		
//		List <Product> Ptampung=new ArrayList<Product>();
//
//		List <JenisProduct> Jp=new ArrayList<JenisProduct>();
//		Jp=Rjp.findAll();
//		JenisProduct Jpob=new JenisProduct();
//		
//		for (JenisProduct Jenisproduct : Jp) {
//			if (Jenisproduct.getJenis_product() != 0) {
//				Jpob.setJenis_product();
//				 
//			}
//			Ptampung.add(Pr);
//		}
//		
//		
//		if(Lp != null) {
//			Product Pr=new Product();
//			
//			
//			for (Product product : Lp) {
//				if (product.getjenis_Product() != null) {
//					
//					 Pr.setjenis_Product(product.getjenis_Product());
//					 Gson gson = new Gson();
//					 String json = gson.toJson(new Product(Pr.getjenis_Product()));
//					 
//					 Pr.setNama_product(Jp.get(index));
//					 
//					 
//					 
//				}
//				Ptampung.add(Pr);
//			}
//			
//			
//		}
		return Rp.getProductAll();
	}

	@Override
	public List<Product> getDetailAllProduct(int id) {
		return Rp.getProductDetailAll(id);
	}

	@Override
	public Product insertProduct(Product Pr) {
		return Rp.save(Pr);
		
	}

	@Override
	public Product updateProduct(Product Pr) {
		return Rp.save(Pr);
	}

	@Override
	public Product getFindOne(Long id) {
		return Rp.findOne(id);
	}
	
	public String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        return fileName;
//        try {
//            // Check if the file's name contains invalid characters
//            if(fileName.contains("..")) {
////                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
//            }
//
////            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());
//
////            return dbFileRepository.save(dbFile);
//            
//        } catch (IOException ex) {
////            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
//        }
    }

	public void delete(Long id) {
		Rp.delete(id);
	}


}
