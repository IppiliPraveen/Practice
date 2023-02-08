package com.java.inh;

class Con1{
	Con1(){
		System.out.println("Base class Constructor");
	}
}
class Con2 extends Con1{
	Con2(){
		System.out.println("Derived Class Construtor");
	}
}
public class inhCon {
	public static void main(String[] args) {
		Con2 c2=new Con2();
	}

}
