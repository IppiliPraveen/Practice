package com.java.practice;

public class Swap {

	public static void main(String[] args) {
		String s1="Praveen";
		String s2="Naveen";
		
		String[] str= {"praveen", "naveen", "sai", "naidu", "prakash","pawan"};
		String key="vi";
		System.out.println("------------------------------");
		int c=0;
		for (String s : str) {
			if(s.substring(0, key.length()).equals(key)) {
				c++;
				System.out.println("Results : "+s);
			}
			
		}
		if(c==0) {
			System.out.println("NO Results");
		}
		System.out.println("------------------------------");
	
	}

}
