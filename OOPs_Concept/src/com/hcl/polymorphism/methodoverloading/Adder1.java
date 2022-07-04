package com.hcl.polymorphism.methodoverloading;

public class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
