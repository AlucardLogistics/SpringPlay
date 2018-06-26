package com.alucardLogistics.demospring.DemoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	

	public static void main(String[] args) {
		

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getRandomFortune());
		
		//close context
		context.close();

	}

	

}
