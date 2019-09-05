package org.springFramework.datasource_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springFramework.datasource_demo.Employee;
import org.springFramework.datasource_demo.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        EmployeeDAO dao=context.getBean("employeeDAO",EmployeeDAO.class);
        dao.createEmployee(new Employee());
        
    }
}