package com.rama.products.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Products {
	
	
	@Override
	public String toString() {
		return "Products [productsid=" + productsid + ", productname=" + productname + ", productdescription="
				+ productdescription + ", brandid=" + brandid + "]";
	}

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long productsid;
	public Long getProductsid() {
		return productsid;
	}
	public void setProductsid(Long productsid) {
		this.productsid = productsid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public long getBrandid() {
		return brandid;
	}
	public void setBrandid(long brandid) {
		this.brandid = brandid;
	}
	@NotBlank(message = "Product name cannot be blank")
	private String productname;
	
	private String productdescription;
	private long brandid;
	 
		// TODO Auto-generated method stub
	}
	


