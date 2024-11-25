package com.app.shivam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(16)
public class DatabaseCoreRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Database con runner...");
		
	}
	
}
