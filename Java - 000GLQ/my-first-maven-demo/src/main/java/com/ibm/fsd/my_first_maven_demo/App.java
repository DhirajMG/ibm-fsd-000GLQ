package com.ibm.fsd.my_first_maven_demo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        System.out.println( "Hello World!" );
      
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = factory.openSession();
        /*session.getTransaction().begin();
        Employee emp = new Employee("Dhiraj","password","dmg@gg.com","India");
        session.persist(emp);
        System.out.println("Inserted!");
        session.getTransaction().commit();*/
        Query query = session.createQuery("from Employee");
        @SuppressWarnings("unchecked")
        List<Employee> list = query.getResultList();
        for(Employee e:list) {
        	System.out.println(e);
        }
    }catch (Exception e) {
    	e.printStackTrace();
    }
}
}
