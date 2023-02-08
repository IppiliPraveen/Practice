package com.java.practice;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] rs= {100,50,10,5,2};
		while(T-->0) {
			int Q=sc.nextInt();
			int P=sc.nextInt();
			int amt=Q*P;
			if(Q>100) {
				amt-=(amt)*0.1;
				System.out.println(amt+".000000");
			}
			else {
				System.out.println(amt+".000000");
			}
			
			
		}
		
	}
}
