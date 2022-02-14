package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example.demo.repository" })
@EnableAutoConfiguration
@EntityScan("com.example.demo")
@ComponentScan(basePackages={"com.example.demo"})
@PropertySource("classpath:application.properties")
public class MappingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingProjectApplication.class, args);
	}

}
 