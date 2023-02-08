package com.java.sup;

class First{
	public void show() {
		System.out.println("This is First Class");
	}
}
class Second extends First{
	 public void show() {
		
		 super.show();
		System.out.println("This is Second Class");
	}
}
public class supEx {
	public static void main(String[] args) {
		//First f=new First();
		Second s=new Second();
		//First fs=new Second();
		//f.show();
		//fs.show();
		s.show();
		
	}

}
