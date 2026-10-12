package com.example.filterdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void create(){
        System.out.println("student created ~Repository");

//        try {
//            Thread.sleep(2000);
//        }
//        catch (Exception e){
//
//        }
    }
}
