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
@Table(name = "color")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Color {


	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="color_id")
	private Long colorId;
	@Column(name="color_name")
	private String colorName;
	 
		// TODO Auto-generated method stub
	}
	


