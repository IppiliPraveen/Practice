package com.java.demo;

public class conEx {
	int a,b,c;
	conEx(){
		a=2;
		c=3;
	}
	public conEx(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "conEx [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		conEx cx=new conEx();
		System.out.println(cx);
		conEx cx1=new conEx(9,36);
		System.out.println(cx1);
	}

}
