package com.rama.products.service;

import java.util.List;

import com.rama.products.entity.Products;

public interface ProductsService {

	  Products saveProducts(Products products);
	  public List<Products> fetchProductstList();
	List<Products> fetchProductsList();
	
	public Products fetchProductsById(Long productsId);
	
}
