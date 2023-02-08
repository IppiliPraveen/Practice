package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=12;
		int b=1313;
		int c=122;
		int d=678;
		int e=898;
		UserMainCode um=new UserMainCode();
		System.out.println(um.findKey(a,b,c,d,e));
	}
	
	private int findKey(int input1, int input2, int input3, int input4, int input5) {
		int[] aa= {input1,input2,input3,input4,input5};
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<5;i++) {
			int [] arr=new int[10];
			int temp=aa[i];
			while(temp>0) {
				arr[temp%10]++;
				temp/=10;
			}
			
			int max=Integer.MIN_VALUE;
			int c=0;
			Arrays.sort(arr);
			for(int j=0;j<10;j++) {
				if(arr[j]!=0 && max<arr[j]) {
					max=arr[j];
					c++;
				}
			}
			if(c==1) {
				res.add(aa[i]);
			}	
		}
		Collections.sort(res);
		
		return res.get(res.size()-1)-res.get(0);
	}

	public int findKey1(int input1,int input2,int input3) {
		int[] aa= {input1,input2,input3};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<3;i++) {
			int temp=aa[i];
			List<Integer> arr=new ArrayList<>();
			while(temp>0) {
				arr.add(temp%10);
				temp/=10;
			}
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
			for(int j=0;j<arr.size();j++) {
				if(min>arr.get(j)) {
					min=arr.get(j);
				}
				if(max<arr.get(j)) {
					max=arr.get(j);
				}
			}
			sum1+=min;
			sum2+=max;
		}
		return sum1-sum2;
	}

}
