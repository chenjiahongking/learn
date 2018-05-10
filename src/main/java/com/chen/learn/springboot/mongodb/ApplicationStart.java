package com.chen.learn.springboot.mongodb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStart {
	public static void main(String[] args) throws IOException {
		SpringApplication sa = new SpringApplication(ApplicationStart.class);
		InputStream in = ApplicationStart.class.getClassLoader().getResourceAsStream("application.properties");
		Properties properties = new Properties();
		properties.load(in);
		sa.setDefaultProperties(properties);
		sa.run(args);
	}
}
