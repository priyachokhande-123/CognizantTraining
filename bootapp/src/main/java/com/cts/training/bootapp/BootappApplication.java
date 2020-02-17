package com.cts.training.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//contains all configuration and annotation
@SpringBootApplication
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}

}

/*1.use this as configuration class 
 * 
 *2. use this as spring boot config
 *   a. read pom.xml file and config the apppln
 *   b.read application.properties file and config the application
 *   
 * 3. also contain component scanning  by default component scanning root path the package that contains main class
 * 
 * if multiple scanning path then define @SpringBootApplication(scanBasePackages ={"com.cts.training.bootapp",""})
 * 
 */
