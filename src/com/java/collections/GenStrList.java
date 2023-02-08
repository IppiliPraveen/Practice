package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class GenStrList {
	public static void main(String[] args) {
		List<String> L=new ArrayList<String>();
		L.add("Praveen");
		L.add("Vamsi");
		L.add("Java");
		L.add("madhu");
		for (String st : L) {
			System.out.println(st);
			
		}
	}

}
