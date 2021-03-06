package org.springFramework.spring_demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String teamname;
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public CricketCoach() {
		super();
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		
		return "practice 5k running today" + getTeamname() + " " + getEmail();
	}

	public String getDailyFortune() {
		
		return fortuneService.getDailyFortuneService();
	}

}
