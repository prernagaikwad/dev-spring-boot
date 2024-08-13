package com.prernagaikwad.springboot.cruddemo.DAO;

import com.prernagaikwad.springboot.cruddemo.Entity.Course;
import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;
import com.prernagaikwad.springboot.cruddemo.Entity.InstructorDetail;

import java.util.List;

public interface AppDAO
{

    void save(Instructor theInstructor) ;

    Instructor findInstructorById(int theId) ;


    void deleteInstructorById(int theId) ;

    InstructorDetail  findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId) ;

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse) ;

    Course findCourseById(int theId);

    void deleteCourseById(int theId);
}
