package com.java.ex;
import java.util.*;
public class voting {
	public void check(int age)throws VotingException{
		if (age < 18) {
			throw new VotingException("You are not elligible for voting...");
		} else {
			System.out.println("You are Elligible for Voting...");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		voting v=new voting();
		try {
			v.check(age);
		}catch(VotingException e) {
			e.printStackTrace();
		}
	}
}
