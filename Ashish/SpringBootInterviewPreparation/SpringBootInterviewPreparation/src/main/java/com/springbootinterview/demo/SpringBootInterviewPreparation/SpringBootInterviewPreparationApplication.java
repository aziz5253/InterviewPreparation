package com.springbootinterview.demo.SpringBootInterviewPreparation;

import com.springbootinterview.demo.SpringBootInterviewPreparation.config.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootInterviewPreparationApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(SpringBootInterviewPreparationApplication.class, args);


		UserService u1 = context.getBean(UserService.class);
		UserService u2 = context.getBean(UserService.class);

		System.out.println(u1 == u2);

	}

}
