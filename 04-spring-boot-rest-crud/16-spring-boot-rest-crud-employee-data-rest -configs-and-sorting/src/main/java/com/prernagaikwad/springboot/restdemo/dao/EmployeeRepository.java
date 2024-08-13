package com.prernagaikwad.springboot.restdemo.dao;

import com.prernagaikwad.springboot.restdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}