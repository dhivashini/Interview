package com.dhiva.implementation;

class Interview {
	String name;
	public static String makeFriend(String name) {
		String s = "hi" + name;
		return s;
	}

}

class User {
	public static void main(String[] args) {
		String hello = Interview.makeFriend("hello");
		System.out.println(hello);
		String well = Interview.makeFriend("world");
		System.out.println(well);
	}
}
