package com.java.demo;

public class empEx {
	int empNo;
	String name;
	double sal;
	public empEx() {
		this.empNo=1;
		this.name="praveen";
		this.sal=32132.1;
	}
	public empEx(int empNo, String name,double sal) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "empEx [empNo=" + empNo + ", name=" + name + ", sal=" + sal + "]";
	}/*
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
	}*/
	

}