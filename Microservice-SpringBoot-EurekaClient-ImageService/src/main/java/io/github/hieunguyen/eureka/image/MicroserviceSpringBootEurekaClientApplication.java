package io.github.hieunguyen.eureka.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  
public class MicroserviceSpringBootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSpringBootEurekaClientApplication.class, args);
	}

}
