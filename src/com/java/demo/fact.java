package com.java.demo;

public class fact {
	public void code(int n) {
		int f=1;
		while(n>0) {
			f=f*n;
			n--;
		}
		System.out.print(f);
	}
	public static void main(String[] args) {
		int n=8;
		fact f=new fact();
		f.code(n);
	}
	
}
