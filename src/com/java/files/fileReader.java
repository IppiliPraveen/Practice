package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	public static void main(String[] args) {
		File f=new File("C:/Users/ippilip/eclipse-workspace/DemoProject/src/com/java/practice/roman.java");
		try {
			FileReader fr=new FileReader(f);
			int ch;
			try {
				while((ch=fr.read())!=-1) {
					System.out.print((char)ch);
				}
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
