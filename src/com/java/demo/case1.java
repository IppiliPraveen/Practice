package com.java.demo;

public class case1 {
	public void disp(int n) {
		switch(n) {
		case 1:
			System.out.println("Enterd number is 1");
			
		case 2:
			System.out.println("Enterd number is 2");
			
		case 3:
			System.out.println("Enterd number is 3");
			
		case 4:
			System.out.println("Enterd number is 4");
			
		case 5:
			System.out.println("Enterd number is 5");
			
		default:
			System.out.println("Enterd invalid number");
			
		}
	}
	public static void main(String[] args) {
		int n=1;
		case1 c1=new case1();
		c1.disp(n);
	}

}
