package com.ibm.fsd.EmployeeCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateStudent {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.openSession();
		
		try {								
			int studentId = 10;
			
			// now get a new session and start transaction
			session = factory.openSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
			myStudent.setLastName("Doe");
			myStudent.setEmail("scooby@luv2code.com");
			session.merge(myStudent);
			
			// commit the transaction
			session.getTransaction().commit();

						
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}