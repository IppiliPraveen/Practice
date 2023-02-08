package com.java.practice;

import java.util.Scanner;

//1) Write a Program to display a number in english words from 1 to 9999

public class pract1 {
	static String eng(int n) {
		String[] ones=new String[] {"","one","two","three","four","five"
				,"six","seven","eight","nine"};
		String[] two_dig=new String[] {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
		
	};
		String[] tens=new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] hund=new String[] {"hundred","thousand"};
		if(n>99 && n<=9999) {
			if(n>=100 && n<=999) {
				n/=100;
				return ones[n]+ " "+hund[0]+" ";
			}
			if(n>=1000 && n<=9999) {
				n/=1000;
				return ones[n]+" thousand ";
			}
		}
		if(n>=0 && n<10) {
			return ones[n%ones.length]+" ";
		}
		if(n>=10 && n<20) {
			n-=10;
			return two_dig[(n%two_dig.length)]+" ";
		}
		if(n>=20 && n<=99) {
			n/=10;
			return tens[n%tens.length]+" ";
		}
		else
			return "Invalid or Out of range Number";
	}
	static String InVal() {
		return "Invalid Value !!!";
	}
	static void code(int n) {
		String s="";
		int k=0;
		while(n>0) {
			
			//System.out.println(n);
			
			
			if((n%100<=19 && n%100>=10) && k>2) {
				//System.out.println(n%100);
				s=eng((n%100))+s;
				n/=100;
				k+=2;
			}
			else {
				int x=(n%10)*(int)Math.pow(10,k);
				s=eng(x)+s;
			
			k++;
			n/=10;
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		//pract1 p=new pract1();
		Scanner sc=new Scanner(System.in);
	
		int n= sc.nextInt();
		if(n<0 || n>9999) {
			System.out.println(InVal());
		}
		else{
			code(n);
		}
	}

}
