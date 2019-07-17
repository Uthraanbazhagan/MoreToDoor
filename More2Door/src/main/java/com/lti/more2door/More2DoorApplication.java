package com.lti.more2door;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti")
@EntityScan("com.lti.entity")
public class More2DoorApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(More2DoorApplication.class, args);
		System.out.println("HELLO");
	}

}
