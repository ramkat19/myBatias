package com.te;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.te.customer.dao")
public class TeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeServicesApplication.class, args);
	}
}
