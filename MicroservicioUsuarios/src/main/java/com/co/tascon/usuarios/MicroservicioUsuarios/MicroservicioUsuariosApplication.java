package com.co.tascon.usuarios.MicroservicioUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@ComponentScan({ "co.com.tascon.common.usuario.models.entity" })
@EnableDiscoveryClient
@EnableJpaRepositories({ "co.com.tascon.common.usuario.models.entity" })
@EntityScan({ "co.com.tascon.common.usuario.models.entity" }) 
@SpringBootApplication
public class MicroservicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioUsuariosApplication.class, args);
		System.out.println("Server Activated!");
	}

}
