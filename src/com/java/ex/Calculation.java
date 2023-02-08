package com.java.ex;

public class Calculation {
	public void cal(int a,int b) throws NegativeNumberException,NumberZeroException{
		if(a<0 || b<0) {
			throw new NegativeNumberException("NegativeNumberException !!!");
		}
		if(a==0 || b==0) {
			throw new NumberZeroException("NumberZeroException !!!");
		}
		else {
			System.out.println(a+b);
		}
	}
	public static void main(String[] args) {
		int a=10;
		int b=0;
		Calculation c=new Calculation();
		try {
			c.cal(a, b);
		}catch(NumberZeroException |NegativeNumberException e) {
			e.printStackTrace();
		}
	}

}
