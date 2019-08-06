package com.maruti.controller.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maruti.model.CarModel;

@RestController
@RequestMapping("/model")
public class ModelRestController {

	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/show")
	public String showMsg() {
		
		return "Message from ModelProducer: "+port;
	} 
	
	@GetMapping("/one")
	public CarModel getOne() {
		return new CarModel(101021, "Vitara Brezza", 9000000.00, "under working");
	} 
	
	@GetMapping("/all")
	public List<CarModel> getList(){
		
	
	
	return Arrays.asList(
					
				new CarModel(10210, "Dezire", 450000.00, "running"),
				new CarModel(10211, "ALTO", 350000.00, "nice look"),
				new CarModel(10212, "NANO", 150000.00, "under working"),
				new CarModel(10213, "Wagnor", 850000.00, "processing"),
				new CarModel(10214, "Ertiga", 750000.00, "working"),
				new CarModel(10215, "Boleno", 950000.00, "manufacturing")
			);
	} 
	
	
	
}
