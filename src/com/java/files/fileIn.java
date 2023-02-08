package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileIn {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:/FileEx/roman.java");
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
		}
	}
}
