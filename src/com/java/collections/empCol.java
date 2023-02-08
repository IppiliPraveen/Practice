package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class empCol {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		SortedSet a=new TreeSet(c);
		a.add(new employ(9,"Praveen",987653));
		a.add(new employ(10,"Vamsi",874563));
		a.add(new employ(6,"MAdhu",943974));
		a.add(new employ(7,"Chandu",928746));
		a.add(new employ(11,"Rakesh",842964));
		a.add(new employ(12,"Guna",738937));
		a.add(new employ(8,"Divyani",985256));
		a.add(new employ(5,"Omkar",975482));
		System.out.println("Employs List : ");
		for (Object ob : a) {
			employ emp=(employ)ob;
			System.out.println(emp);
			
		}

	}
}
