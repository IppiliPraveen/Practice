package com.java.practice;

import java.util.Scanner;

public class CodeEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		/*
		int m=sc.nextInt();
		int k=sc.nextInt();
		
		for(int i=n;i<=m;i++) {
			int t=i;
			while(t>0) {
				if(t%10==k) {
					System.out.println(i);
					break;
				}
				t/=10;
			}
		}*/
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
			
		}
		System.out.println(f);
		
	}
}
