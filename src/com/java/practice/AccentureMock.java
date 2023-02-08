package com.java.practice;

import java.util.Scanner;

//min no.of steps to equal all values in array

public class AccentureMock {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int res=0;
		sum/=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>=sum) {
				res+=(arr[i]-sum);
			}
		}
		System.out.println(res);
	}

}
