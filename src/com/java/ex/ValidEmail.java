package com.java.ex;

public class ValidEmail extends Exception{
	ValidEmail(){}
	ValidEmail(String error){
		super(error);
	}

}
