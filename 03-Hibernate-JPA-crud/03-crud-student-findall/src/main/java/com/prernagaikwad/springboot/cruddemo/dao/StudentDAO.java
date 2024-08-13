package com.prernagaikwad.springboot.cruddemo.dao;

import com.prernagaikwad.springboot.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

}