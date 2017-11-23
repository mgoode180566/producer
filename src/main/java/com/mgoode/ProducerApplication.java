package com.mgoode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
@Component("com.mgoode")
public class ProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
