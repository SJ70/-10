package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.exception.CustomException;
import com.example.demo.exception.Data;
import com.example.demo.exception.InputRestriction;
import com.example.demo.response.ApiResponse;

import com.example.demo.response.Code;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController extends BaseController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/{name}/{grade}")
    public ApiResponse<Student> add(
            @PathVariable("name") String name,
            @PathVariable("grade") int grade
    ) {
        try {
            Student student = studentService.addStudent(name, grade);
            return new ApiResponse<Student>(student);
        }
        catch (IllegalArgumentException e) {
            throw new CustomException(Code.BAD_REQUEST, e.getMessage(), new Data(new InputRestriction(6)));
        }
    }

    @GetMapping("/student")
    public ApiResponse<Student> getAll() {
        return new ApiResponse<Student>(studentService.getStudents());
    }

}
