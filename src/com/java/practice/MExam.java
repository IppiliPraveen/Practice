package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MExam {
	public static int lastNumberLeft(int N,int[] A) {
		int result = -404;
		Arrays.sort(A);
		List<Integer> x=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			x.add(A[i]);
		}
		
		int s=0,L=N-1;
		for(int i=1;i<N;i++) {
			if(i%2!=0) {
				x.remove(s);
				L--;
			}
			else {
				x.remove(L);
				L--;
			}
		}
		result=x.get(0);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		System.out.print(lastNumberLeft(N,A));
	}

}
