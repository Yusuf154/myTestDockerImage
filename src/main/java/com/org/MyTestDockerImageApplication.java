package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTestDockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestDockerImageApplication.class, args);
		System.out.println("Hellow world this is a docker image test");
	}

}
