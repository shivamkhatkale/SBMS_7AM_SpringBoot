package com.example.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmailConfig econfig;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(econfig);
	}

}
