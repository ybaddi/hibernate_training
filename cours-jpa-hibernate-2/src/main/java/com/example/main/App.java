package com.example.main;

import java.time.LocalDate;
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
		LocalDate ld = LocalDate.of(1985, 1,15);
        personne.setDatenaissence(ld);
        entityManager.persist(personne);
        
        Account account = new Account(10000.0, 4.5);
        //account.setCreatedat(ld);
        entityManager.persist(account);
        
        Account account_1 = entityManager.find(Account.class, 1);
        System.out.println(account_1);
        account_1.setCredit(50000.00);
        account_1.setRate(3.60);
        entityManager.persist(account_1);
        
        transaction.commit();
        Personne personne_1 = entityManager.find(Personne.class, 14);
        System.out.println(personne_1);
        entityManager.close();
    }
}
