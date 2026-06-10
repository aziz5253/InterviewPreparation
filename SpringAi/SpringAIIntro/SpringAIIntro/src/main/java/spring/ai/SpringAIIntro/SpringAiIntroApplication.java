package spring.ai.SpringAIIntro;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import spring.ai.SpringAIIntro.service.OpenAiServiceImpl;

@SpringBootApplication
public class SpringAiIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiIntroApplication.class, args);
	}

	// ✅ CALL SERVICE HERE
	@Bean
	CommandLineRunner run(OpenAiServiceImpl service) {
		return args -> {
			String answer = service.getAnswer("What is the meaning of life?");
			System.out.println("✅ AI RESPONSE: " + answer);
		};
	}
}
