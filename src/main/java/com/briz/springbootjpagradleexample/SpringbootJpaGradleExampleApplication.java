package com.briz.springbootjpagradleexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// BUILD.GRADLE IS THE FOLDER WHERE WE ADD THE DEPENDENCIES 
// SRC/MAIN/RESOURCES IS FOR DATABASE CONFIGURATION AS SIMILAR TO MAVEN
@SpringBootApplication
public class SpringbootJpaGradleExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaGradleExampleApplication.class, args);
	}

}
