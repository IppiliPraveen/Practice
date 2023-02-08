package com.java.demo;

public class StaticEx {
	static int score;
	public void incr() {
		score++;
	}
	public void  show() {
		System.out.println(score);
	}
	public static void main(String[] args) {
		StaticEx st=new StaticEx();
		StaticEx st1=new StaticEx();
		StaticEx st2=new StaticEx();
		st.incr();
		st1.incr();
		st2.incr();
		st.show();
		
	}

}
