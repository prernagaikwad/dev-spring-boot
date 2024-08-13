package com.prernagaikwad.springboot.cruddemo.DAO;

import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;
import com.prernagaikwad.springboot.cruddemo.Entity.InstructorDetail;

public interface AppDAO
{

    void save(Instructor theInstructor) ;

    Instructor findInstructorById(int theId) ;


    void deleteInstructorById(int theId) ;

    InstructorDetail  findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId) ;
}
