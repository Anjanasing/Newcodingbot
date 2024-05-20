package com.demo;

public class Student {

	private String name;
	private int age;

	public Student(String name) {
		this.name = name;

	}
	//age
	public Student(int age) {
		this.age=age;
	}
	//end age
	

	public Student() {
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}
	
	//age setter getter
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;


}
}
