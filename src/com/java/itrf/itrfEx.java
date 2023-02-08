package com.java.itrf;

class demo implements oneI,twoI{

	@Override
	public void trainer() {
		System.out.println("Trainer Name Is Prasanna");
		
	}

	@Override
	public void topic() {
		System.out.println("Topic Is Java ");
		
	}

}
public class itrfEx {
	public static void main(String[] args) {
		demo d=new demo();
		d.topic();
		d.trainer();
	}

}
