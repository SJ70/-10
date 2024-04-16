package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.response.ApiResponse;

import com.example.demo.response.Code;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController extends BaseController {

    @Autowired
    private final StudentService studentService;

    public MyController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/{name}/{grade}")
    public ApiResponse<Student> addStudent(
            @PathVariable("name") String name,
            @PathVariable("grade") int grade
    ) {
        Student student = studentService.addStudent(name, grade);
        return new ApiResponse<Student>(student);
    }

    @GetMapping("/student")
    public ApiResponse<Student> getStudents() {
        return new ApiResponse<Student>(studentService.getStudents());
    }

}
