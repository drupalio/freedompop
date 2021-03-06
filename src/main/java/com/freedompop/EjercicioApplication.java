package com.freedompop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value = "com.freedompop")
@EnableSwagger2
@EnableJpaRepositories("com.freedompop.persons.dao")
@EntityScan("com.freedompop.persons.entities")
public class EjercicioApplication {


	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);
	}

}
