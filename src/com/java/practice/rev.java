package com.java.practice;

public class rev {
	static String codeRev(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		return res;
	}
}
