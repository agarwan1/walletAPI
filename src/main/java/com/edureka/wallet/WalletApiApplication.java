package com.edureka.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class WalletApiApplication {
	static final Logger log = 
	        LoggerFactory.getLogger(WalletApiApplication.class);
	public static void main(String[] args) {
		log.info("Before Starting application");
		SpringApplication.run(WalletApiApplication.class, args);
		log.debug("Starting my application in debug with {} args", args.length);
		log.info("Starting my application with {} args.", args.length);  
	}
}
