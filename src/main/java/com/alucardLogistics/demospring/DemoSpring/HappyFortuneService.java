package com.alucardLogistics.demospring.DemoSpring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you win the win.";
	}

}
