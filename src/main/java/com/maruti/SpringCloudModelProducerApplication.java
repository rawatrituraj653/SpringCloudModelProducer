package com.maruti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudModelProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudModelProducerApplication.class, args);
	}

}
