package com.java.practice;

import java.util.Scanner;

public class Naveen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int Id=sc.nextInt();
		int num=sc.nextInt();
		String name=sc.nextLine();
		String adrs=sc.nextLine();
		
		
		System.out.println("Entered Details Are \n"
				+ "ID : "+Id+"\nName : "+name+"\n"
						+ "Address : "+adrs+"\nNumber : "+num);
	}

}
