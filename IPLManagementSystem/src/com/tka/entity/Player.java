package com.tka.entity;

public class Player {
	int jerseyNo;
	String name;
	int runs;
	int wicket;
	String teamName;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int jerseyNo, String name, int runs, int wicket, String teamName) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.runs = runs;
		this.wicket = wicket;
		this.teamName = teamName;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + ", runs=" + runs + ", wicket=" + wicket
				+ ", teamName=" + teamName + "]";
	}

	
	
	

}
