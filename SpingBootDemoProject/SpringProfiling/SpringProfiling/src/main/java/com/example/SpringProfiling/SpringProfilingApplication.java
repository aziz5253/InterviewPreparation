package com.example.SpringProfiling;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;


@SpringBootApplication
public class SpringProfilingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilingApplication.class, args);
	}

}
