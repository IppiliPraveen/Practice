package com.java.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
	public static void main(String[] args) throws IOException {
		
		FileWriter myWriter = new FileWriter("D:\\FinalFile.txt");
		File file =new File("D:\\FileEx\\sumanth");
		File[] fileList=file.listFiles();
		String s="";
		for (File f : fileList) {
			try {
				FileReader fr=new FileReader(f);
				int ch;
				while((ch=fr.read())!=-1) {
					s+=String.valueOf((char)ch);
				}
				fr.close();
				//System.out.println(s);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s);
			System.out.println("=======================");
		}
		myWriter.write(s);
		myWriter.close();
	}
	

}
