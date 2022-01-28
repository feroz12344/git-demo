package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	public void addData(String deta){
		System.out.println("adding data to repo");
		if (deta.equals("java")){
			System.out.println("welcome to ur system");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
