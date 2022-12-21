package com.rama.products.service;

import java.util.List;
import java.util.Optional;

import com.rama.products.entity.Products;
import com.rama.products.error.ProductNotFoundException;

public interface ProductsService {

	  Products saveProducts(Products products) throws ProductNotFoundException;
	  public List<Products> fetchProductstList();
	List<Products> fetchProductsList();
	
	public Products fetchProductsById(Long productsId);
	
}
