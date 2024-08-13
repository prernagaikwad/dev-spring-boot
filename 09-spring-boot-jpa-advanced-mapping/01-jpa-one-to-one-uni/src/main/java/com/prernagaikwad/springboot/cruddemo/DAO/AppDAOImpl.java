package com.prernagaikwad.springboot.cruddemo.DAO;

import com.prernagaikwad.springboot.cruddemo.Entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;

@Repository
public class AppDAOImpl implements AppDAO
{

    // define field for entity manager
    private EntityManager entityManager ;

    // inject entity manager using constructor injection
    @Autowired
    public AppDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager ;
    }


    @Override
    @Transactional
    public void save(Instructor theInstructor)
    {
        entityManager.persist(theInstructor);




    }
}
