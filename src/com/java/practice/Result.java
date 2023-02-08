package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// buckets filled accordingly queries
public class Result {
	
	public static int FilledBuckets(int N, List<Integer> queries) {
		int[] arr=new int[N];
		int c=0;
		for(int i=0;i<N;i++) {
			arr[i]=1;
		}
		for(Integer i:queries) {
			if(i==2) {
				for(int j=0;j<N;j++) {
					if(j%2==0) {
						arr[j]=0;
					}
				}
			}
			
			if(i==3) {
				for(int j=0;j<N;j++) {
					if(j%2!=0) {
						arr[j]=0;
					}
				}
			}
			if(i==4) {
				for(int j=0;j<N;j++) {
					arr[j]=0;
					}
				}
			if(i==1) {
				for(int j=0;i<N;i++) {
					arr[j]=1;
				}
			}
	
		}
		for(int i=0;i<N;i++) {
			if(arr[i]==1) {
				c++;
			}
		}
		return N-c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<M;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(FilledBuckets(N,list));
		
	}

}
