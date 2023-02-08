package com.java.practice;

import java.util.Scanner;
// rooms and gold coins Problemn
public class Jva {
	public String code(int[] rooms,int K) {
		int sum=0;
		String res="";
		
		int f=0;
		for(int i=0;i<rooms.length;i++) {
			int j=i+1;
			sum+=rooms[i];
			while(j<rooms.length) {
				
				if(sum<K) {
					
					sum+=rooms[j];
					j++;
				}
				if(sum==K) {
					int t=i+1;
					res=""+t+" "+j+"";
					f=1;
					break;
					
				}
				
			}
			if(f==1) {
				break;
			}
		}
		//System.out.println("sum "+sum);
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] rooms=new int[N];
		for(int i=0;i<N;i++) {
			rooms[i]=sc.nextInt();
		}
		Jva ob=new Jva();
		System.out.println(ob.code(rooms,K));
		
	}

}
