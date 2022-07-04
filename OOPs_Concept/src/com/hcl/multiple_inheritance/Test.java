package com.hcl.multiple_inheritance;

public class Test implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Test obj = new Test();
		obj.print();
		obj.show();
	}
}
