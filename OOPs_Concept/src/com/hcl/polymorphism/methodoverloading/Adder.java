//1) Method Overloading: changing no. of arguments

package com.hcl.polymorphism.methodoverloading;

public class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}