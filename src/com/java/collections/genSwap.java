package com.java.collections;

class Data<T>{
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("a Value "+a+"\nb Value "+b);
	}
}
public class genSwap {
	public static void main(String[] args) {
		int a=10,b=12;
		String s1="Praveen",s2="ippili";
		boolean t=true,f=false;
		Data d=new Data();
		d.swap(a,b);
		d.swap(s1, s2);
		d.swap(t, f);
	}

}
