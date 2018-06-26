package com.alucardLogistics.demospring.DemoSpring;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Coach baseballCoach = new BaseballCoach();
    	Coach trackCoach = new TrackCoach();
    	Coach soccerCoach = new SoccerCoach();
    	
    	System.out.println(baseballCoach.getDailyWorkOut());
    	System.out.println(trackCoach.getDailyWorkOut());
    	
    	
    }
}
