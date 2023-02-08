package com.java.demo;

public class Boxing {
	public static void main(String[] args) {
		
	
	int a=12;
	String name="Praveen";
	double sal=23456.45;
	
	Object ob1=a;
	Object ob2=name;
	Object ob3=sal;
	
	int a1=(int)ob1;
	String b1=(String)ob2;
	double s1=(Double)ob3;
	
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(s1);
	}
}
