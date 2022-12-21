package com.rama.products.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rama.products.entity.Products;
import com.rama.products.error.ProductNotFoundException;
import com.rama.products.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	private ProductsService productsservice;
	
	
	@PostMapping("/products")
	public Products saveProducts(@RequestBody @Valid Products products) throws ProductNotFoundException {
		return productsservice.saveProducts(products);
	}

	
	@GetMapping("/products")
    public List<Products> fetchDepartmentList() {
        
        return productsservice.fetchProductsList();
    }
	
	@GetMapping("/products/{id}")
    public Products fetchProductsById(@PathVariable("id") Long productsId) {
            
        return productsservice.fetchProductsById(productsId);
    }

}
