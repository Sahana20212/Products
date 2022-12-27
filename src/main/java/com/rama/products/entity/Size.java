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
@Table(name = "size")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Size {


	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="size_id")
	private Long sizeId;
	@Column(name="size_name")
	private String sizeName;
	 
		// TODO Auto-generated method stub
	}
	


