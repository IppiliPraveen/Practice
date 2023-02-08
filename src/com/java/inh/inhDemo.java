package com.java.inh;

class First{
	public void show() {
		System.out.println("First Class");
	}
}

class Scond extends First{
	public void  disp() {
		System.out.println("Sceond Class");
	}
}
public class inhDemo {
	public static void main(String[] args) {
		Scond s=new Scond();
		s.show();
		s.disp();
	}
	
}
