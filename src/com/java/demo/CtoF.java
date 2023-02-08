package com.java.demo;

public class CtoF {
	public void calcl(double c) {
		double f=((9*c)/5)+32;
		System.out.println("Fahrenheit Value  " +f);
	}
	public static void main(String[] args) {
		int c=37;
		CtoF obj=new CtoF();
		obj.calcl(c);
	}

}
