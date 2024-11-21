package com.example.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner{

	@Autowired
	private EmailConfig emailConfig;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emailConfig);
	}

}
