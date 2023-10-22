package com.example.SpringBootTraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

	@GetMapping
	public List<String > hello () {
		List<String> jsonValues = new ArrayList<>();
		jsonValues.add("Hello");
		jsonValues.add("World");
		return jsonValues;
	}

}
