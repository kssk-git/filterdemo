package com.example.filterdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void create(){
        System.out.println("student created ~Repository");
    }
}
