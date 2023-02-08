package com.java.ex;

public class VarifyEmail {
	public void check(String s)throws ValidEmail{
		int f=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='@') {
				String[] a=s.split("@");
				if(a[0].length()>8 && a[0].length()<16) {
					f=1;
				}
			}
		}
		if(f==0) {
			throw new ValidEmail("Invaid Email !!! \nMay Be Missing '@'"
					+ " \n\t\tor "
					+ "\nUserName Length Must Be Min 8 and Max 16 Characters \n" );
		}
		else {
			System.out.println("Valid Email ID");
		}
	}
	public static void main(String[] args) {
		String s="Praveen@gmail.com";
		VarifyEmail ve=new VarifyEmail();
		try {
			ve.check(s);
		}catch(ValidEmail e) {
			e.printStackTrace();
		}
	}
}
