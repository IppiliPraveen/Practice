package com.java.demo;

import java.util.Scanner;

public class exam1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			if(r!=1 && r!=0) {
				int f=1;
				for(int i=2;i*i<=r;i++) {
					if(r%2==0) {
						f=0;
						break;
					}
				}
				if(f==1) {
					System.out.println(r);
					sum+=r;
				}
			}
			num/=10;
		}
		System.out.println(sum);
	}

}
