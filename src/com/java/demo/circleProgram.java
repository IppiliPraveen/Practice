package com.java.demo;

public class circleProgram {
	public void cal(double r) {
		double area=3.14*r*r,prmtr=3.14*r*2;
		System.err.println("Area : "+area);
		System.err.println("prmtr : "+prmtr);
	}
	public static void main(String[] args) {
		double r=9.7;
		circleProgram obj=new circleProgram();
		obj.cal(r);
	}

}
