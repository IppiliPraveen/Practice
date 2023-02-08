package com.java.demo;



public class StCon {
	static {
		System.out.println("Static constructor");
	}
	/*StCon(){
		System.out.println("General Constructor");
	}*/
	public StCon() {
		System.out.print("OK");
	}
	public static void main(String[] args) {
		StCon stc=new StCon();
	}

}
