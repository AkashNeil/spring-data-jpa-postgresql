package io.github.seebaware.springdatajpapostgresql;

import io.github.seebaware.springdatajpapostgresql.student.Student;
import io.github.seebaware.springdatajpapostgresql.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringDataJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPostgresqlApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student mike = new Student("Mike", "Mendez", "mike@mail.com", 48);
			studentRepository.save(mike);
		};
	}

}
