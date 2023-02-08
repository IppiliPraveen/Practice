package com.java.practice;

import java.util.Scanner;

public class roman {
	static String eng(int n) {
		String[] ones=new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String[] tens=new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		
		String[] hund=new String[] {"","C","CC","CCC","CD","D"};
		
		if(n>=1 && n<10) {
			return ones[n%ones.length];
		}
		if(n>=10 && n<100) {
			n/=10;
			return tens[n%tens.length];
		}
		if(n>=100 && n<=500) {
			n/=100;
			return hund[n%hund.length];
		}
		return "invalid";
	}
	static void code(int n) {
		int k=0;
		String s="";
		while(n>0) {
			int x=(n%10)*(int)Math.pow(10,k);
			s=eng(x)+s;
			k++;
			n/=10;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		code(n);
	}

}
