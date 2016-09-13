package main.java;

public class Animal {

	private String race;
	private String name;
	private int age;
	
	public Animal() {
		this.age = 0;
		this.race = "";
	}

	public Animal(String race, int age) {
		this.race = race;
		this.age = age;
	}
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
