package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmp {
	public static void main(String[] args) {
		List<employ> empL=new ArrayList<employ>();
		empL.add(new employ(1,"Praveen",98765));
		empL.add(new employ(2,"Vamsi",98675));
		empL.add(new employ(3,"Madhu",97865));
		empL.add(new employ(4,"Chandu",96785));
		for (employ e : empL) {
			System.out.println(e);
			
		}
	}

}
