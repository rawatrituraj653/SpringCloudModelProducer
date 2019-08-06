package com.maruti.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarModel {

	private Integer modelId;
	private String modelName;
	private Double moodelCost;
	private String status; 
}
