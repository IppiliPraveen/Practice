package com.java.collections;

public class employ {
	int eNo;
	String name;
	double basic;
	
	public employ(int eNo, String name, double basic) {
		super();
		this.eNo = eNo;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "employ [eNo=" + eNo + ", name=" + name + ", basic=" + basic + "]";
	}
}
