package com.dhiva.implementation;

public class Person implements Comparable {
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

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getSex() {
		return this.sex;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Object arg0) {
		Person p1 = (Person) arg0;
		// return (this.age < p1.age) ? -1 : (this.age > p1.age) ? 1 : 0;
		// return this.age-p1.age;
		return this.lastName.compareTo(p1.lastName);
	}

	@Override
	public boolean equals(Object o) {
		Person p1 = (Person) o;
		if (this.getFirstName().equals(p1.getFirstName()) && this.getLastName().equals(p1.getLastName())
				&& this.age == p1.age && this.getSex().equals(p1.getSex())) {
			return true;
		}
		else{
		return false;
		}
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        return result;
	}
}
