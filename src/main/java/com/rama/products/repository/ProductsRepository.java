package com.rama.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rama.products.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
