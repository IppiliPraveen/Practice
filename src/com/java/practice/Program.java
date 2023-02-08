package com.java.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			FileReader fr=new FileReader("D:\\files\\Praveen");
			int ch;
			String s="";
			while((ch=fr.read())!=-1) {
				s+=String.valueOf((char)ch);
			}
			fr.close();
			System.out.println(s);
			String[] sArr=s.split("\n");
			List<String> ls=Arrays.asList(sArr);
			Iterator it=ls.iterator();
			System.out.println("==========================================================================================");
			while(it.hasNext()) {
				String res=(String)it.next();
				
				System.out.println(res);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
