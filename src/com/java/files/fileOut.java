package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOut {
	public static void main(String[] args) {
		try {
			FileInputStream src=new FileInputStream("C:/Users/ippilip/eclipse-workspace/DemoProject/src/com/java/practice/pract1.java");
			 FileOutputStream tar=new FileOutputStream("D:/FileEx/NumToWord.java");
			 int ch;
			 while((ch=src.read())!=-1) {
				 tar.write((char)ch);
			 }
			 src.close();
			 tar.close();
			 System.out.println("***C O P I E D***");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*
		try {
			FileInputStream fin = new FileInputStream("D:/FileEx/NumToWord.java");
			int ch;
			while((ch=fin.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
	}
}
