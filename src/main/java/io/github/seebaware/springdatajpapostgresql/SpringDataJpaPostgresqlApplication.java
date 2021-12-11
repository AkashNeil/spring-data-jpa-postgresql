package io.github.seebaware.springdatajpapostgresql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPostgresqlApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student mike = new Student("Mike", "Mendez", "mike@mail.com", 48);
			studentRepository.save(mike);
		};
	}

}
