package com.dhiva.implementation;

public class Person {
	public String firstName, lastName, sex;
	public int age;

	Person() {

	}

	public Person(String firstName, String lastName, String sex, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.firstName;
	}
	public String sex(){
		return this.sex;
	}
	public int age(){
		return this.age;
	}
}
