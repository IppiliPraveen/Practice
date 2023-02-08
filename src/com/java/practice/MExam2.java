package com.java.practice;

import java.util.Scanner;

public class MExam2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s="";
		for(int i=0;i<N;i++) {
			s=sc.next();
		}
		System.out.print(getInitialism(N,s));
	}

	public  static String getInitialism(int n, String s) {
		String result="-404";
		String res="";
		for (Character ch : s.toCharArray()) {
			if(ch>=65 && ch<=90) {
				System.out.println(ch);
				res+=String.valueOf(ch);
			}
		}
		result=res;
		System.out.println(res);
		return result;
	}

}
