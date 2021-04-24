package com.tel.SpringHibernateApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ComponentScan("com.tel.SpringHibernateApi")
@SpringBootApplication
@EnableSwagger2
public class SpringHibernateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApiApplication.class, args);
	}

}
