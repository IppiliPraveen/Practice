package com.java.ex;

public class exDemo {
	public static void main(String[] args) {
		int[] a=new int[] {12,5};
		try {
			a[10]=6;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size Is Small");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
