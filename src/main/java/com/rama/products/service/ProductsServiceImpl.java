package com.rama.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.products.entity.Products;
import com.rama.products.repository.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService{
	
	@Autowired
    private ProductsRepository productsRepository;


	@Override
	public Products saveProducts(Products products) {
		//Products product = product.
		//		build(0, product.getProductname(), product.getProductdescription(),
          //              product.getBrandid());
		return productsRepository.save(products);
		
		
	}
	
	 
	@Override
	    public List<Products> fetchProductsList() {
	        return productsRepository.findAll();
	    }


	


	@Override
	public Products fetchProductsById(Long productsId) {
		// TODO Auto-generated method stub
		return productsRepository.findById(productsId).get();

	}


	//@Override
	public List<Products> fetchProductstList() {
		// TODO Auto-generated method stub
		return null;
	//}


	


	
	}}


	
	

	

