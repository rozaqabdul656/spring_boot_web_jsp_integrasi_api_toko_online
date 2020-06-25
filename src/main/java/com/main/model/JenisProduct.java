package com.main.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_jenis_product")
public class JenisProduct  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long jenis_product;
	
	private String nama_jenis_product;
	
//	private Set<Product> Products;
	
	
	public long getJenis_product() {
		return jenis_product;
	}

	public JenisProduct(long jenis_product) {
		this.jenis_product = jenis_product;
	}
	
	public JenisProduct() {
	
	}


	
	public void setJenis_product(long jenis_product) {
		this.jenis_product = jenis_product;
	}

	public String getNama_jenis_product() {
		return nama_jenis_product;
	}

	public void setNama_jenis_product(String nama_jenis_product) {
		this.nama_jenis_product = nama_jenis_product;
	}
	
//	@OneToMany(mappedBy = "JenisProduct",cascade = CascadeType.ALL)
//	public Set<Product> getProduct(){
//		return Products;
//	}
//	
	public void setProducts(JenisProduct jenis_product) {
		this.jenis_product=jenis_product.jenis_product;
		
	}
	
	@Override
	public String toString() {
//		String result = String.format("JenisProduct[id = %d,nama_jenis_product='%s']%n",
//				jenis_product,nama_jenis_product);
//		
		String result = String.format("JenisProduct[id = %d,name='%s']%n",jenis_product,nama_jenis_product);
		
//				String.format("%s",nama_jenis_product);
		
		
//		if(Products != null) {
//			for(Product product : Products) {
//				result += String.format("JenisProduct[id = %d,name='%s']%n",
//				product.getId_product(),product.getNama_product());
//			}
//				
//		}
		return result;
	}
	
	
}
