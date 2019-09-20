package com.vince.multi.app;

import static java.util.Collections.singletonList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@SpringBootApplication
public class VinceMultiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinceMultiAppApplication.class, args);
	}
	
	
    public VinceMultiAppApplication(FreeMarkerConfigurer freeMarkerConfigurer) {
        freeMarkerConfigurer.getTaglibFactory().setClasspathTlds(singletonList("/META-INF/security.tld"));
    }

}
