package com.co.tascon.gateway.MicroservicioSpringGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicioSpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSpringGatewayApplication.class, args);
		System.out.println("Server Gateway is running...");
	}

}
