package org.springFramework.spring_demo;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
    	try {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Coach myCoach = context.getBean("theCoach",Coach.class);
    	System.out.println(myCoach.getDailyWorkout() + " " + myCoach.getDailyFortune());
    }catch(Exception e) {
    e.printStackTrace();
    }
    }
}
