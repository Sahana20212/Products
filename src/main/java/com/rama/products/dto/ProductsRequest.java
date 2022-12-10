package com.rama.products.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor


public class ProductsRequest {
//@NotNull(message = "productname shouldn't be null")
@NotBlank(message = "Product name cannot be blank")
private String productname;

	
	private String productdescription;
	
	private long brandid;
	
	
	
}
