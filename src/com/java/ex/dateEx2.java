package com.java.ex;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateEx2 {
	public static void main(String[] args) {
		String str="2021-12-13";
		dateEx2 dx=new dateEx2();
		try {
			dx.show(str);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
	public void show(String str)throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dt=sdf.parse(str);
		System.out.println(dt);
	}
	
}
