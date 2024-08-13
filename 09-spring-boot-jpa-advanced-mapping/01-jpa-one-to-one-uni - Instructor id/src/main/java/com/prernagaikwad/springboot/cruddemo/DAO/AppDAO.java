package com.prernagaikwad.springboot.cruddemo.DAO;

import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;

public interface AppDAO
{

    void save(Instructor theInstructor) ;

    Instructor findInstructorById(int theId) ;


    void deleteInstructorById(int theId) ;
}
