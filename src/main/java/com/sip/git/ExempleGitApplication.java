package com.sip.git;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExempleGitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExempleGitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
	}

}
