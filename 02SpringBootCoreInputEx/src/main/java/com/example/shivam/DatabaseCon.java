package com.example.shivam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCon {

	@Value("${ my.db.driver }")
	private String driver;

	@Value("${ my.db.url }")
	private String url;

	@Value("${ my.db.usr }")
	private String usr;

	@Value("${ my.db.pwd }")
	private String pwd;

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", usr=" + usr + ", pwd=" + pwd + "]";
	}

}
