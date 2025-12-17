package com.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.entity")
@EnableJpaRepositories("com.repository")
@ComponentScan("com")
public class OnlineComplaintManagementSystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(OnlineComplaintManagementSystemApplication.class, args);
		
	}

}
