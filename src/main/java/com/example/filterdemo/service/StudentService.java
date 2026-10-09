package com.example.filterdemo.service;

import com.example.filterdemo.controller.StudentController;
import com.example.filterdemo.entity.Student;
import com.example.filterdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createdstudent(Student student){
        System.out.println("student service called");
         studentRepository.create();
        Student info = student;
        info.getAge();
        info.getName();
        info.getId();
        return info;
    }
}
