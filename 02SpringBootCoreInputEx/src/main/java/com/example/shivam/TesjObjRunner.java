package com.example.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TesjObjRunner implements CommandLineRunner {

	@Autowired
	private DatabaseCon dbCon;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
