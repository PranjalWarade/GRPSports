package com.LetsPlay.LetsPlay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.LetsPlay.LetsPlay.Repo"})
public class LetsPlayApplication {
	public static void main(String[] args) {
		SpringApplication.run(LetsPlayApplication.class, args);
	}

}
