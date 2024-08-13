package com.prernagaikwad.springboot.restdemo.dao;

import com.prernagaikwad.springboot.restdemo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}