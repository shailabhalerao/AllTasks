package com.hcl.abstaction.usinginterface;

public class TestInterface {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
