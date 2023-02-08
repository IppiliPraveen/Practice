package com.java.demo;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		int n=sc.nextInt();
		for(int i=0;i<=2*n;i++) {
			for(int j=0;j<=2*n;j++) {
				if(i<=n) {
					if(j<n-i || j>n+i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else if(j<i-n || j>3*n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
