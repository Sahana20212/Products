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
@Table(name = "sku")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class SKUS {	

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sku_id")
	private Long skuId;
	@NotBlank(message = "Product name cannot be blank")
	@Column(name="sku_name")
	private String skuName;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "size_id", nullable = false)
    @ManyToOne
    private Size size;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "color_id", nullable = false)
    @ManyToOne
    private Color color;

	 
		// TODO Auto-generated method stub
	}
	


