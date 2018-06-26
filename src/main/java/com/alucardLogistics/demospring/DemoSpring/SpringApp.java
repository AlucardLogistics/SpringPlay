package com.alucardLogistics.demospring.DemoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach baseCoach = context.getBean("baseCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(baseCoach.getDailyWorkOut());
		System.out.println(baseCoach.getWeeklyWorkOut());
		System.out.println(soccerCoach.getWeeklyWorkOut());
		System.out.println(baseCoach.getDailyFortune());
		System.out.println(soccerCoach.getDailyFortune());
		
		context.close();

	}

}
