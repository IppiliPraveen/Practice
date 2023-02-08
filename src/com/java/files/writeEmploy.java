package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeEmploy {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:/FileEx/Emp.txt");
			ObjectOutputStream ob = new ObjectOutputStream(f);
			employ emp = new employ(1, "Praveen", 70935);
			ob.writeObject(emp);
			ob.close();
			f.close();
			System.out.println("Employ Object Stored...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
