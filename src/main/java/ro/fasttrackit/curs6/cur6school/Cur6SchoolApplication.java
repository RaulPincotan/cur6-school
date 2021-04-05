package ro.fasttrackit.curs6.cur6school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs6.cur6school.entity.Student;
import ro.fasttrackit.curs6.cur6school.repository.StudentRepository;

import java.util.List;

@SpringBootApplication
public class Cur6SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cur6SchoolApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(StudentRepository repository) {
		return args -> {
			repository.saveAll(List.of(
					new Student("Ana", 25),
					new Student("Ioan", 25),
					new Student("George", 45)
			));
		};
	}

}
