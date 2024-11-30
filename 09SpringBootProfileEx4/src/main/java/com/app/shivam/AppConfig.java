package com.app.shivam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

	@Bean
	@Profile({"default","qa"})
	public PdfExportService p1() {

		PdfExportService ps = new PdfExportService();
		ps.setFileExt(".pdf");
		ps.setFtyp("DOCUMENT-NPDF");
		return ps;

	}

}
