package com.alucardLogistics.demospring.DemoSpring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	//empty constructor
	public CricketCoach() {
		System.out.println("CricketCoach: no arg contructor.");
	}

	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}



	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}



	//custom setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		return "Daily: Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getWeeklyWorkOut() {
		return "Weekly: Crick it!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {		
		return fortuneService.getRandomFortune();
	}

}
