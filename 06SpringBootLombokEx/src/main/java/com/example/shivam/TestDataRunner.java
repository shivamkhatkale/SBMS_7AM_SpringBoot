package com.example.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private Process pob;

	@Override
	public void run(String... args) throws Exception {
//		pob.setCode("AA");
//		pob.setPort(387483);
//		System.out.println(pob);
		
		Process p1 = 
				Process.builder()
				.code("AA")
				.id(88)	
				.type("MODEL")
				.build();
		
		System.out.println(p1);
		
	}

}
