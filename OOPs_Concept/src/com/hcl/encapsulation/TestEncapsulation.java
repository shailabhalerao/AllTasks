package com.hcl.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAcc_no(7560504000L);
		acc.setName("mansi bhalerao");
		acc.setEmail("mansi@gmail.com");
		acc.setAmount(400000f);
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
	}
}
