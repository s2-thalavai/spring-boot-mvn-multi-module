package com.sivasankar.java.mvnmultimodule.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMultiModuleMainApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringMultiModuleMainApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(SpringMultiModuleMainApplication.class, args);
		
		LOGGER.info("SpringMultiModuleMainApplication Started........");
	}

}