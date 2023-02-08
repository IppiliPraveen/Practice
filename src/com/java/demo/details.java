package com.java.demo;

public class details {
	int eno;
	String name;
	@Override
	public String toString() {
		return "details [eno=" + eno + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		details dt=new details();
		details dt1=new details();
		dt.eno=1805964;
		dt.name="praven";
		System.out.println(dt);
		dt.eno=1805966;
		dt.name="vamsi";
		System.out.println(dt1);
		
	}

}
