package com.squidfarms.thymejsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"com.squidfarms"} )
public class ThymejspApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymejspApplication.class, args);
	}

}
