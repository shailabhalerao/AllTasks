package com.hcl.abstaction.usinginterface;

public class Test implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Test obj = new Test();
		obj.print();
	}

}
