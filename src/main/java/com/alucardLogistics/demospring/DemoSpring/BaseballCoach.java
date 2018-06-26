package com.alucardLogistics.demospring.DemoSpring;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public BaseballCoach() {
		super();
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Daily: Spend 30 min on batting practice.";
	}
	
	public String getWeeklyWorkOut() {
		return "Weekly: Hit 10 Homeruns.";
	}

	//@Override
	public String getDailyFortune() {
		return "Baseball: " + fortuneService.getFortune();
	}

}
