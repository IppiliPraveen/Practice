package com.java.practice;

public class OPPs {
	
	static String code() {
		System.out.println("<----------< This code() Method >----------->");
		return "Naveen";
	}

	public static void main(String[] args) {
		
		System.out.println(code()); // For Calling code() method
		
		OPPs op=new OPPs();        // Creating obejct for Calss OOPs
		
		System.out.println(op.code1());// for Calling code1() method
	}
	
	public int code1() {
		System.out.println("<----------< This code1() Method >----------->");
		return 1;
	}

}
