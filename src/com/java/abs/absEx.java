package com.java.abs;


public class absEx {
	public static void main(String[] args) {
		training[] arr=new training[] {
				new praveen(),
				new vamsi()
		};
		for (training training : arr) {
			training.name();
			training.mail();
		}
	}
}
