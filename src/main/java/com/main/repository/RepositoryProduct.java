package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.model.JenisProduct;
import com.main.model.Product;


@Repository
public interface RepositoryProduct extends JpaRepository <Product, Long>{
	@Query(value = "SELECT * FROM tb_jenis_product WHERE jenis_product=:jenis_p", nativeQuery=true)
	JenisProduct setjenis_Product(@Param("jenis_p") int id);
	
    @Query(value = "select a.*,b.* from tb_product a JOIN tb_jenis_product b ON a.jenis_product = b.jenis_product", nativeQuery=true)
    public List<Product> getProductAll();

    @Query(value = "select a.*,b.* from tb_product as  a JOIN tb_jenis_product as b ON a.jenis_product = b.jenis_product where a.id_product=:id", nativeQuery=true)
    public List<Product> getProductDetailAll(@Param("id") int id);

    
}
