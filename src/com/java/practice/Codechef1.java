package com.java.practice;
/* package codechef; // don't place package name! */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for(int t=1; t<=tc; t++){
		    int n = scn.nextInt();
		    long ans = (long)n*(n+1)/2;
		    ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
		    for(int i=0; i<=n; i++){
		        indexes.add(new ArrayList<>());
		        indexes.get(i).add(-1);
		    }
		    System.out.println("\ninitial :"+indexes);
		    for(int i=0; i<n; i++){
		        int m = scn.nextInt();
		        indexes.get(m).add(i);
		    }
		    System.out.println("=================================="
		    		+ "==========================================="
		    		+ "=======================================\n"+indexes+"\n=================================="
		    		+ "==========================================="
		    		+ "=======================================\n");
		    
		    for(int i=1; i<=n; i++){
		        indexes.get(i).add(n);
		        for(int j=1; j<indexes.get(i).size(); j++){
		            int l = (indexes.get(i).get(j)) - (indexes.get(i).get(j-1))-1;
		            ans-=Math.max(0, l-i+1);
		        }
		    }
		    System.out.println(ans);
		}
	}
}
