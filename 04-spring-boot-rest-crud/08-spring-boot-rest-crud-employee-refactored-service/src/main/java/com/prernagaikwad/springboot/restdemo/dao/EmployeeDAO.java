package com.prernagaikwad.springboot.restdemo.dao;

import com.prernagaikwad.springboot.restdemo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}