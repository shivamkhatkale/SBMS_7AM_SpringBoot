package com.app.shivam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailConfigRunner implements CommandLineRunner{

	 @Override
	public void run(String... args) throws Exception {
		 System.out.println("EmailConfig Runner....");
	}
	
}
