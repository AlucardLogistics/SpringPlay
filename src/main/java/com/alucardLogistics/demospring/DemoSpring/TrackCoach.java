package com.alucardLogistics.demospring.DemoSpring;

public class TrackCoach implements Coach {
	
private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
		
	public TrackCoach() {
		super();
	}



	public String getDailyWorkOut() {
		return "Daily: Run a hard 5k.";
	}

	@Override
	public String getWeeklyWorkOut() {
		return "Weekly: Run a hard 15k.";
	}

	public String getDailyFortune() {		
		return "Tracking: " + fortuneService.getFortune();
	}

}
