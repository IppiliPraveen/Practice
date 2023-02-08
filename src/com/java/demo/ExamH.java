package com.java.demo;
import java.util.ArrayList;	
import java.util.List;
import java.util.Scanner;
public class ExamH {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of List : ");
		int n=sc.nextInt();
		System.out.println("Enter Items Into List : ");
		List<String> lst=new ArrayList<>();
		for(int i=0;i<n;i++) {
			lst.add(sc.next());
		}
		for(int i=0;i<lst.size();i++) {
			int c=0;
			for(int j=i;j<lst.size();j++) {
				if(lst.get(i).equals(lst.get(j))) {
					if(c>0) {
						lst.set(j, lst.get(i)+c);
						c++;
					}
					else {
							c++;
					}
				}
			}
		}
		for (String s : lst) {
			System.out.println(s);
		}
	}
}
