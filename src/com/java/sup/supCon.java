package com.java.sup;

class emp{
	int eno;
	String name;
	double sal;
	public emp(int eno, String name, double sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "emp [eno=" + eno + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
class praveen extends emp{

	public praveen(int eno, String name, double sal) {
		super(eno, name, sal);
		// TODO Auto-generated constructor stub
	}
}
class vamsi extends emp{

	public vamsi(int eno, String name, double sal) {
		super(eno, name, sal);
		// TODO Auto-generated constructor stub
	}
	
}
class madhu extends emp{

	public madhu(int eno, String name, double sal) {
		super(eno, name, sal);
		// TODO Auto-generated constructor stub
	}
	
}
public class supCon {
	public static void main(String[] args) {

		praveen p=new praveen(9,"praveen",30000);
		vamsi v=new vamsi(8,"vamshi",30000);
		madhu m=new madhu(10,"madhu",30000);
		System.out.println(p);
		System.out.println(v);
		System.out.println(m);
		
	}
}
