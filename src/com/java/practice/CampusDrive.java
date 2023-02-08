package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CampusDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] arr=new int[10];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				System.out.println("*");
			else
				System.out.println(arr[i]);
		}
		
	}

}
