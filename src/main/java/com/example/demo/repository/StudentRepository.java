package com.example.demo.repository;

import com.example.demo.domain.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        this.students.add(student);
        return student;
    }

}
