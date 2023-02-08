package com.java.files;

import java.io.Serializable;

public class employ implements Serializable{
	private int empno;
	private String name;
	private double basic;
	
	public employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	public employ() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}	

}
