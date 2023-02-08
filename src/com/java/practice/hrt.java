package com.java.practice;

public class hrt {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=7-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(i-j);
			}
			for(int j=2;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
 *     1
 *    212
 *   32123
 *  4321234
 * 
 */



