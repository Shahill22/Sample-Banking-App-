package com.shahil.BankApp.banking;

public class otpGenerator {
	public int generateOTP() {
		int min =1000;
		int max =9999;
		int range= max - min +1;
				
		int randomPin = (int)(Math.random() * range) + min;
		return randomPin;
		
	}

}
