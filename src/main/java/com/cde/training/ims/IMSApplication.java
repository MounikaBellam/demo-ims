package com.cde.training.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMSApplication.class, args);
	}

}
