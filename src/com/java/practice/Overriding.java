package com.java.practice;

import java.util.Scanner;

class Parent {

	void Print()
	{
		System.out.println("parent class");
	}
}
class subclass1 extends Parent {
	void Print() { 
		System.out.println("subclass1"); }
}

class subclass2 extends Parent {

	void Print()
	{
		System.out.println("subclass2");
	}
}
class Overriding {
	public static void main(String[] args)
	{
		
		Parent a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}

