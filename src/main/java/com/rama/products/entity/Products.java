package com.rama.products.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Products {	

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private Long productsId;
	@NotBlank(message = "Product name cannot be blank")
	@Column(name="product_name")
	private String productName;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", nullable = false)
    @ManyToOne
    private Brand brand;
    
    
	@Column(name="rating")
	private long rating;
	 
		// TODO Auto-generated method stub
	}
	


