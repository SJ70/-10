package com.example.demo.domain;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        if (grade > 5) {
            throw new IllegalArgumentException("grade는 6 이상을 입력할 수 없습니다.");
        }
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
