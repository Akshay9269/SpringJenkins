package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("CommandLine Running");	
	System.out.println("Inside main ");
	}

}
