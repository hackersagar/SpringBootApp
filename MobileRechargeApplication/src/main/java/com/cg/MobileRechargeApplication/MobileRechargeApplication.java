package com.cg.MobileRechargeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.cg.model")
@EnableJpaRepositories("com.cg.repo")
@SpringBootApplication
@ComponentScan("com.cg")
public class MobileRechargeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileRechargeApplication.class, args);
	}
}
