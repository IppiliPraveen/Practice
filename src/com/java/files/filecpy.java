package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecpy {
	public static void main(String[] args) {
		File src=new File("C:/Users/ippilip/eclipse-workspace/DemoProject/src/com/java/practice/roman.java");
		File tar=new File("D:/FileEx/roman.java");
		try {
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(tar);
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("***COPIED SUCCESSFULLY***");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
			
}


