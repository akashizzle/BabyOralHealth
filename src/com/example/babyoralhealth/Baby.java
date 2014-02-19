package com.example.babyoralhealth;

import java.util.List;

public class Baby {
	private String age;
	private String teeth;
	private String dentist;
	private String lastVisit;
	private List<String> traits;
	
	public Baby(String age, String teeth, String dentist, String lastVisit, List <String> traits){
		this.age = age;
		this.teeth = teeth;
		this.dentist = dentist;
		this.traits = traits;
		this.lastVisit = lastVisit;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTeeth() {
		return teeth;
	}

	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}

	public String getDentist() {
		return dentist;
	}

	public void setDentist(String dentist) {
		this.dentist = dentist;
	}

	public String getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}

	public List<String> getTraits() {
		return traits;
	}

	public void setTraits(List<String> traits) {
		this.traits = traits;
	}
}
