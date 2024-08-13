package com.prernagaikwad.springboot.cruddemo;

import com.prernagaikwad.springboot.cruddemo.DAO.AppDAO;
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
            createInstructor(appDAO);
        };

    }

    private void createInstructor(AppDAO appDAO)
	{


		// create the instructor
        Instructor tempInstructor =
                new Instructor("chad", "Darby", "darby@luv2code.com");

        // create the instructor detail
		InstructorDetail tempInstructorDetail =
                new InstructorDetail(
		        "http://www.luv2code.com/youtube",
                "Luv 2 code !!!"
	             );

		 /*

		// create the instructor


		Instructor tempInstructor =
				new Instructor("Madhu", "Patel", "madhu@luv2code.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.luv2code.com/youtube",
						"Guitar"
				);
		*/


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
