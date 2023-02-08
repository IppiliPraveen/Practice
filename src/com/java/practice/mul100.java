package com.java.practice;

public class mul100 {
	static String mul(String n1,String n2) {
		sum sm=new sum();
		int e1=0;
		int len_1=n1.length();
		int len_2=n2.length();
		String ss="";
		int k;
		for (int i=len_1-1;i>=0;i--) {
			int e=0;
			int a=n1.charAt(i)-'0';
			String s="";
			for(int j=len_2-1;j>=0;j--) {
				int b=n2.charAt(j)-'0';
				s=String.valueOf((a*b+e)%10)+s;
				
				e = (a*b+e)/10;
				
			}
			k=len_1-1-i;
			while(k!=0) {
				s+="0";
				k--;
			}
			if(e>0) {
				s=e+s;
			}
			//System.out.println("k_val "+k);
			//System.out.println("s_val "+s);
			if(s.length()>ss.length()) {
				ss=sm.code(ss, s);
			}
			else {
				ss=sm.code(s, ss);
			}
		}
		return ss;
	}
	public static void main(String[] args) {
		String n1="987654321987654321";
		String n2="123456789123456789";
		if(n1.length()<n2.length()) {
			System.out.println(mul(n1,n2));
		}
		else {
			System.out.println(mul(n2,n1));
		}	
	}
}
