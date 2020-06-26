package com.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="tb_product")
@EntityListeners(AuditingEntityListener.class)
public class Product  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id_product;
	
	private String nama_product;
	private String gambar_product;
	private Integer berat;
	
	private Integer harga;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jenis_product")
    @OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
    public JenisProduct jenisProduct;
	
	
	public Product() {
	
	}
	
	public Product(JenisProduct jenisProduct2) {
//		this.jenisProduct=jenisProduct2;
	}
	
	public Product(long id_product, String nama_product, Integer berat, Integer harga) {
		this.id_product = id_product;
		this.nama_product = nama_product;
		this.berat = berat;
		this.harga = harga;
//		this.jenis_Product = jenis_Product;
	}

	public long getId_product() {
		return id_product;
	}

	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public String getNama_product() {
		return nama_product;
	}

	public void setNama_product(String nama_product) {
		this.nama_product = nama_product;
	}

	public Integer getBerat() {
		return berat;
	}

	public void setBerat(Integer berat) {
		this.berat = berat;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	public JenisProduct getJenisProduct() {
		return jenisProduct;
	}

	public void setJenisProduct(JenisProduct jenisProduct) {
		this.jenisProduct = jenisProduct;
	}

	public String getGambar_product() {
		return gambar_product;
	}

	public void setGambar_product(String gambar_product) {
		this.gambar_product = gambar_product;
	}
	
	
	
	
	
	
}
