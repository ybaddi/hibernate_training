package com.example.main;

import java.util.List;

import com.example.model.Account;
import com.example.model.Personne;

/**
 * Hello world!
 *
 */

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-config");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Personne personne = new Personne("Dalton", "Jack");
        entityManager.persist(personne);
        
        Account account = new Account(10000.0, 4.5);
        entityManager.persist(account);
        
        Account account_1 = entityManager.find(Account.class, 1);
        System.out.print(account_1);
        
        transaction.commit();
        System.out.println(personne);
        entityManager.close();
    }
}
