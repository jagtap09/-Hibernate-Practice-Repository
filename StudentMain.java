package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;


public class StudentMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		Student s =new Student ();
		s.setStud_id(2);
		s.setName("Piyush");
		s.setAge(30);
		s.setCity("Pune");
		
		ss.persist(s);
		System.out.println(s);
		
		tr.commit();
		ss.close();
		
	    System.out.println("Application started..");
	 	
		
	
	
	
	
	
	
	
	}

}