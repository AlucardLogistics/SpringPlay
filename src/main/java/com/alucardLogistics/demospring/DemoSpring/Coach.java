package com.alucardLogistics.demospring.DemoSpring;

public interface Coach {
	
//	default String getDailyWorkOut() {
//		return "Spend 30 min playing Beat Saber on VR!";
//	}
	
	public String getDailyWorkOut();
	
	public String getWeeklyWorkOut();
	
	public String getDailyFortune();
	
	public String getRandomFortune();

}
