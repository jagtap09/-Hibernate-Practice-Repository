package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
public class DepartmentMain {

	public static void main(String[] args) {			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml") ;
			cfg.addAnnotatedClass(Department.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tr=ss.beginTransaction();
			
			Department d=new Department();
			d.setDeptid(1);
			d.setDeptname("HR");
	        ss.persist(d);
			System.out.println(d);
			System.out.println("insered data...");
			
			tr.commit();
			ss.close();
			sf.close();
			
			
		}
	}

