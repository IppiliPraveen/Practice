package com.java.demo;

import java.util.Scanner;

public class exam {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		if(s.length()%2==0) {
			
			for(int i=0;i<s.length()-1;i+=2) {
				if(s.charAt(i)>s.charAt(i+1)) {
					res+=String.valueOf(s.charAt(i));
				}
				else {
					res+=String.valueOf(s.charAt(i+1));
				}
			}
		}
		if(s.length()%2!=0) {
			
			for(int i=0;i<s.length()-2;i+=2) {
				if(s.charAt(i)>s.charAt(i+1)) {
					res+=String.valueOf(s.charAt(i));
				}
				else {
					res+=String.valueOf(s.charAt(i+1));
				}
			}
			res+=s.charAt(s.length()-1);
		}
		System.out.println(res);
	}
}
