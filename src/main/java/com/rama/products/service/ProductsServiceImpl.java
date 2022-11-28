package com.rama.products.service;

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
		// TODO Auto-generated method stub
		return productsRepository.save(products);
	}

	
	
	}


