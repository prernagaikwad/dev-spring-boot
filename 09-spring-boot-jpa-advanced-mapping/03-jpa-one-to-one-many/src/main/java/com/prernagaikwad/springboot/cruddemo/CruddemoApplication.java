package com.prernagaikwad.springboot.cruddemo;

import com.prernagaikwad.springboot.cruddemo.DAO.AppDAO;
import com.prernagaikwad.springboot.cruddemo.Entity.Course;
import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;
import com.prernagaikwad.springboot.cruddemo.Entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {

        return runner ->
        {
            //createInstructor(appDAO);
            //findInstructor(appDAO) ;
            //deleteInstructor(appDAO) ;
            //findInstructorDetail(appDAO);
           //deleteInstructorDetail(appDAO);

            createInstructorWithCourses(appDAO);
        };

    }

    private void createInstructorWithCourses(AppDAO appDAO)
    {

        Instructor tempInstructor =
                new Instructor("Susan", "Public", "susan@luv2code.com");

        // create the instructor detail
        InstructorDetail tempInstructorDetail =
                new InstructorDetail(
                        "http://www.youtube.com",
                        "Video Games"
                );

        // associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        //create some courses
        Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide") ;
        Course tempCourse2 = new Course("The pinball Masterclass") ;

        // add courses to instrcutor
        tempInstructor.add(tempCourse1);
        tempInstructor.add(tempCourse2);

        //save the instructor
        //
        //Note: this will also save the course
        // because of CascadeType.PERSIST
        System.out.println("Saving instructor :" +tempInstructor);
        System.out.println("The courses:" + tempInstructor.getCourses() );
        appDAO.save(tempInstructor);
        System.out.println("Done!");


    }

    private void deleteInstructorDetail(AppDAO appDAO)
    {
        int theId = 4;
        System.out.println("Deleting instructor detail id :" + theId);

        appDAO.deleteInstructorDetailById(theId);

        System.out.println("Done !");




    }

    private void findInstructorDetail(AppDAO appDAO) {

        // get the instructor detail object
        int theId = 3;
        InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId) ;

        // print the instructor detail
        System.out.println("tempInstructorDetail: " + tempInstructorDetail);

        // print the associted instructor
        System.out.println("The associated instructor:" + tempInstructorDetail.getInstructor()) ;
        System.out.println("Done !");
    }

    private void deleteInstructor(AppDAO appDAO)
    {

        int theId =1;
        System.out.println("Deleting instructor id :" + theId);
        appDAO.deleteInstructorById(theId);
        System.out.println("Done !");

    }

    private void findInstructor(AppDAO appDAO)
    {
        int theId = 4;
        System.out.println("Finding instructor id :" + theId);

        Instructor tempInstructor = appDAO.findInstructorById(theId);

        System.out.println("tempInstructor : " + tempInstructor);
        System.out.println("the associated instructorDetail only :+ tempInstructor.getInstructorDetail()");
    }

    private void createInstructor(AppDAO appDAO)
	{

       /*
		// create the instructor
        Instructor tempInstructor =
                new Instructor("chad", "Darby", "darby@luv2code.com");

        // create the instructor detail
		InstructorDetail tempInstructorDetail =
                new InstructorDetail(
		        "http://www.luv2code.com/youtube",
                "Luv 2 code !!!"
	             );

		 */

		// create the instructor


		Instructor tempInstructor =
				new Instructor("Madhu", "Patel", "madhu@luv2code.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.luv2code.com/youtube",
						"Guitar"
				);



		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor

		//

		// NOTE : this will also save the details object
		// because of CascaseType.ALL
		//
		System.out.println("Saving instructor: "+ tempInstructor );
		appDAO.save(tempInstructor);

		System.out.println("Done !!");



    }


}
