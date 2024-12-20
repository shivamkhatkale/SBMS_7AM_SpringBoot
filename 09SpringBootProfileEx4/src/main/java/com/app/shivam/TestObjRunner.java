package com.app.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner{
	
	@Autowired
	private ExportExcelService ex;
	
	@Autowired
	private PdfExportService px;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(ex);		
		System.out.println(px);
	}

}
