package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class readEmploy {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:/FileEx/Emp.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			employ emp = (employ)objin.readObject();
			System.out.println(emp);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
