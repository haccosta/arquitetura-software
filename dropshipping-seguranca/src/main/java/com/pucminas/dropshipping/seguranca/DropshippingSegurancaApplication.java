package com.pucminas.dropshipping.seguranca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.pucminas.dropshipping.seguranca")
@EnableSwagger2
public class DropshippingSegurancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DropshippingSegurancaApplication.class, args);
	}

}
