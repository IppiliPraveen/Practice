package com.java.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TCS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char b[]=new char[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.next().charAt(0);
		}
		Set<Character> set=new TreeSet<Character>();
		for(int i=0;i<n;i++) {
			set.add(b[i]);
		}
		
		char res=b[0];
		int max=0;
		for(Character ch:set) {
			int c=0;
			for(Character in: b) {
				if(ch==in) {
					c++;
					
				}
			}
			
			if(max<c) {
				max=c;
				res=ch;
			}
		}
		System.out.println(res);
	}

}
