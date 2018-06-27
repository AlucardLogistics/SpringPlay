package com.alucardLogistics.demospring.DemoSpring;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	String[] fortunes = {"Random Fortune: You will be the fastest man alive!", 
			"Random Fortune: New contract is coming your way!", 
			"Random Fortune: Try again tomorrow!"};	
	Random rand = new Random();
	int randFortune = rand.nextInt(fortunes.length);
	

	@Override
	public String getFortune() {
		return "Today you win the win.";
	}


	@Override
	public String getRandomFortune() {
		return fortunes[randFortune];
	}

}
