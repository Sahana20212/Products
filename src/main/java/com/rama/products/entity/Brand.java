package com.rama.products.entity;

import javax.persistence.Column;
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
@Table(name = "Brand")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Brand {


	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="brand_id")
	private Long brandId;
	@Column(name="brand_name")
	private String brandName;
	 
		// TODO Auto-generated method stub
	}
	


