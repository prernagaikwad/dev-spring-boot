package com.prernagaikwad.springboot.cruddemo.DAO;

import com.prernagaikwad.springboot.cruddemo.Entity.Course;
import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;
import com.prernagaikwad.springboot.cruddemo.Entity.InstructorDetail;
import com.prernagaikwad.springboot.cruddemo.Entity.Student;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);

    Course findCourseAndStudentsByCourseId(int theId);

    Student findStudentAndCoursesByStudentId(int theId);
    void update(Student tempStudent);
}