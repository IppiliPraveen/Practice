package com.java.practice;

import java.util.Scanner;

public class Interface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("   ");
		int n=sc.nextInt();
		Interface obj= new  Interface();
		System.out.println(obj.isPrime(n));
	}
	public String isPrime(int num) {
		int c=0;
		if(num>1) {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					c=1;
					break;
				}
			}
		}
		if(c==0) {
			return num+" is Prime number";
		}
		return num+" not is Prime number";
	}
}
