package com.example.config;

import com.example.model.Personne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

//	public void Invoke(){
	public static void main(String[] args){
		Configuration config = new Configuration();
//		config.configure("com/example/hibernate.cfg.xml");
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Personne p = new Personne("baddi", "youssef");
		
		session.save(p);
		tr.commit();
		session.close();
		sf.close();
				
	}
}
