package com.java.demo;

public class OverLoad {
	public void show() {
		System.out.println("OverLoad No Parameter");
	}
	public void show(int x) {
		System.out.println("OverLoad int x ");
	}
	public void show(String x) {
		System.out.println("OverLoad String x");
	}
	public void show(int x,int y) {
		System.out.println("OverLoad int x,y Method");
	}
	public void show(int x,String y) {
		System.out.println("OverLoad int x,String y");
	}
	public static void main(String[] args) {
		OverLoad ol=new OverLoad();
		ol.show();
		ol.show(9);
		ol.show("Praveen");
		ol.show(9,36);
		ol.show(9, "Praveen");
	}

}
