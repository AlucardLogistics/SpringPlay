package com.alucardLogistics.demospring.DemoSpring;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public SoccerCoach() {
		super();
	}

	@Override
	public String getDailyWorkOut() {
		return "Daily: Run 10 laps of stadium.";
	}

	@Override
	public String getWeeklyWorkOut() {
		return "Weekly: Practice play for 50 hours.";
	}

	
	public String getDailyFortune() {
		return "Soccer: " + fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return fortuneService.getRandomFortune();
	}

}
