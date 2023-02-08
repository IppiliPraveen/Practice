package com.java.demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String card1=sc.next();
		String card2=sc.next();
		String temp="";
		for(char ch:card2.toCharArray()) {
			temp=String.valueOf(ch)+temp;
		}
		if(temp.equals(card1)) {
			System.out.println("true");
		}
	}

}
