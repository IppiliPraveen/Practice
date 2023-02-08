package com.java.demo;

public class EmpArr {
	public static void main(String[] args) {
		empEx[] emparr=new empEx[] {
				new empEx(1, "Vamshi",25432.1),
				new empEx(2, "Dinesh",23456.6),
				new empEx(3, "Kavyasree",25677.6),
				new empEx(4, "Praveen",45678.5)
		};
		for(empEx i:emparr) {
			System.out.println(i);
		}
	}
}
