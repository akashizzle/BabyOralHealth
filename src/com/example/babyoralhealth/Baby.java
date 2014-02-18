package com.example.babyoralhealth;

import java.util.List;

public class Baby {
	private int age;
	private int teeth;
	private boolean dentist;
	private List<Integer> traits;
	private int lastVisit;
	
	public Baby(int age, int teeth, boolean dentist, int lastVisit, List <Integer> traits){
		this.age = age;
		this.teeth = teeth;
		this.dentist = dentist;
		this.traits = traits;
		this.lastVisit = lastVisit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public boolean isDentist() {
		return dentist;
	}

	public void setDentist(boolean dentist) {
		this.dentist = dentist;
	}

	public List<Integer> getTraits() {
		return traits;
	}

	public void setTraits(List<Integer> traits) {
		this.traits = traits;
	}

	public int getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(int lastVisit) {
		this.lastVisit = lastVisit;
	}
	
}
