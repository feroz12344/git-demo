package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	public void addData(){
		System.out.println("adding data to repo");
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
