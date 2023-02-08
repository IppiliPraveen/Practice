package com.java.demo;

/**
 * @author ippilip
 *
 */
public class max3 {
	public void check(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				System.out.println("Max Number Is "+a);
			}
			else {
				System.out.println("Max Number Is "+c);
			}
		}
		else {
			System.out.println("Max Number Is "+b);
		}
	}
	public static void main(String[] args) {
		int a=5,b=7,c=3;
		max3 obj=new max3();
		obj.check(a, b, c);
	}

}
