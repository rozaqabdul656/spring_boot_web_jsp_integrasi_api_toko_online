package com.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tb_jenis_product")
public class JenisProduct  {
	@Id
	@Column(name = "jenis_product")
	@SequenceGenerator(name="seq-gen_jenis",sequenceName="tb_jenis_product_seq", initialValue=205, allocationSize=12)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen_jenis")
	private Long jenis_product=(long) 0;
	
	
	private String nama_jenis_product;

	public JenisProduct() {
	
	}

	public void setJenis_product(Long jenis_product) {
		this.jenis_product = jenis_product;
	}

	public long getJenis_product() {
		return jenis_product;
	}

	public JenisProduct(long jenis_product) {
		this.jenis_product = jenis_product;
	}
	
	public String getNama_jenis_product() {
		return nama_jenis_product;
	}

	public void setNama_jenis_product(String nama_jenis_product) {
		this.nama_jenis_product = nama_jenis_product;
	}
	
	public void setProducts(JenisProduct jenis_product) {
		this.jenis_product=jenis_product.jenis_product;
		
	}

	

	

	@Override
	public String toString() {
//		String result = String.format("JenisProduct[id = %d,nama_jenis_product='%s']%n",
//				jenis_product,nama_jenis_product);
//		
//		String result = String.format("JenisProduct[id = %d,name='%s']%n",jenis_product,nama_jenis_product);
		String result = String.format("%d%n",jenis_product);
		
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
