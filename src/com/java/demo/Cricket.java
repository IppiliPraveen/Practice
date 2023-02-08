package com.java.demo;

public class Cricket {
	static int score;
	public void incr(int x) {
		score+=x;
	}
	
	public int total() {
		return score;
	}
	
	public static void main(String[] args) {
		
		Cricket t=new Cricket();
		
		Cricket Rohit=new Cricket();
		Cricket KL_Rahul=new Cricket();
		Cricket Kohli=new Cricket();
		
		Rohit.incr(62);
		KL_Rahul.incr(120);
		Kohli.incr(51);
		
		System.out.println(t.total());
		
	}
}
