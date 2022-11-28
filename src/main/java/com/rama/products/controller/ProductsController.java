package com.rama.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rama.products.entity.Products;
import com.rama.products.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	private ProductsService productsservice;
	
	
	@PostMapping("/products")
	public Products saveProducts(@RequestBody Products products) {
		return productsservice.saveProducts(products);
	}

}
