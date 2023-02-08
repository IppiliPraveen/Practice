package com.java.demo;

public class Array {
	public void disp(int[] arr) {
		for(int i: arr) {
			System.out.println(arr);
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {9,18,27,36,54};
		Array a=new Array();
		a.disp(arr);
	}
}
