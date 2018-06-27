package com.alucardLogistics.demospring.DemoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach newInstanceCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		
		boolean result = (theCoach == newInstanceCoach);
		
		//print the results
		System.out.println("Pointing to the same object: " + result);
		System.out.println("False it means the bean has a scope of type prototype \nTrue the bean is a singleton (default).");
		System.out.println("Memory location for theCoach: " +  theCoach);
		System.out.println("Memory location for newInstanceCoach: " +  newInstanceCoach);
		
		
		context.close();

	}

}
