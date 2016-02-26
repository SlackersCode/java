package com.slackerscode.sf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.slackerscode.sf")
public class Application {


	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}