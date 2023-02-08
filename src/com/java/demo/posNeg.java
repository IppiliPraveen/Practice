package com.java.demo;

public class posNeg {
	public void check(int n) {
		if(n>=0) {
			System.out.println("Pasitive Number");
		}
		else
			System.out.println("Negative Number");
	}
	public static void main(String[] args) {
		int n=10;
		posNeg obj=new posNeg();
		obj.check(n);
	}
}