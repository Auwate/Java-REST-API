package com.example.SpringBootTraining;

import com.example.SpringBootTraining.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

	@GetMapping
	public List<Student> hello () {
		List<Student> jsonValues = new ArrayList<>();
		jsonValues.add(new Student(
				1L,
				"Austin",
				"austin.w.uwate@gmail.com",
				LocalDate.of(2003, Month.FEBRUARY, 23),
				20
		));
		return jsonValues;
	}

}
