package com.prernagaikwad.springboot.restdemo.service;

import com.prernagaikwad.springboot.restdemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}