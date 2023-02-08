package com.java.files;

import java.io.File;

public class fileInf {
	public static void main(String[] args) {
		File file1 = new File("C:/Users/ippilip/eclipse-workspace/DemoProject/src/com/java/practice/roman.java");
		System.out.println("File Name  " +file1.getName());
		System.out.println("Full Name   " +file1.getPath());
		System.out.println("Parent Directory  " +file1.getParent());
	}
}
