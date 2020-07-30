package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.JenisProduct;


@Repository
public interface RepositoryJenisProduct extends JpaRepository <JenisProduct, Long>{

}
