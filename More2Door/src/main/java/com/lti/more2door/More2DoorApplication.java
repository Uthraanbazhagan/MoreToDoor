package com.lti.more2door;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.controller")
@ComponentScan("com.lti.dao")
@EntityScan("com.lti.entity")
public class More2DoorApplication {

	public static void main(String[] args) {
		SpringApplication.run(More2DoorApplication.class, args);
		System.out.println("HELLO");
	}

}
