package com.meritamerica.assignment3;

import java.io.FileNotFoundException;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");
		
		CheckingAccount c = new CheckingAccount(100);
		System.out.println(c.getOpenedOn());
		
	}
}