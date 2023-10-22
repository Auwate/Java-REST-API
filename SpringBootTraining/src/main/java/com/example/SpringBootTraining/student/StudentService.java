package com.example.SpringBootTraining.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents () {
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
