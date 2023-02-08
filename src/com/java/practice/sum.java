package com.java.practice;

public class sum {
	static String code(String s1,String s2) {
		int l=s1.length();
		int l1=s2.length();
		String res="";
		int e=0;
		s1=new rev().codeRev(s1);
		s2=new rev().codeRev(s2);
		for(int i=0;i<s1.length();i++) {
			String ans="";
			int a=s1.charAt(i)-'0';
			int b=s2.charAt(i)-'0';
				ans+=String.valueOf((a+b+e)%10);
				e=(a+b+e)/10;
				res+=ans;
		}
		for(int i=l;i<l1;i++) {
			int b=s2.charAt(i)-'0';
			res+=String.valueOf((b+e)%10);
			e=(b=e)/10;
		}
		if(e>0) {
		return new rev().codeRev(e+res);
		}
		else
			return new rev().codeRev(res);
	}
	/*
	public static void main(String[] args) {
		String s1="900";
		String s2="90";
		if(s1.length()>s2.length()) {
			System.out.println(code(s2,s1));
		}
		else {
			System.out.println(code(s1,s2));
		}
	}
	*/
}
