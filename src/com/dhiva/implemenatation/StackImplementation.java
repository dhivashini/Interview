package com.dhiva.implemenatation;


import java.util.Scanner;

public class StackImplementation {
	public static void main(String[] args) {
		System.out.println("Enter the size of the stack");
		Scanner s = new Scanner(System.in);
		int stackSize = s.nextInt();
		Stack stackObj = new Stack(stackSize);
		while (true) {
			System.out.println("Choose #1 to  push #2 to pop #3 to display #4 to exit");
			int option = s.nextInt();
			if (option == 1) {
				System.out.println("Enter element to push");
				int element = s.nextInt();
				stackObj.push(element);
			} else if (option == 2) {
				stackObj.pop();
			} else if (option == 3) {
				stackObj.display();
			} 
		}
	}
}
