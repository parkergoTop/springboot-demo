package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {


    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "PArker",
                        "parkerciao@gmail.com",
                        LocalDate.of(1997,11, 29),
                        24)

        );
    }}
