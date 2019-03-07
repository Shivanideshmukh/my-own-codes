package com.practice;

interface Printable1 {
	void print();
}

interface Showable {
	void show();
}

public class InterfaceEx2 implements Printable1, Showable {

	public static void main(String[] args) {
		InterfaceEx2 obj = new InterfaceEx2();
		Printable1 obj1 = new InterfaceEx2();
		Showable obj2 = new InterfaceEx2();
		obj.print();
		obj.show();
		obj1.print();
		obj2.show();

	}

	@Override
	public void show() {
		System.out.println("Welcome");
	}

	@Override
	public void print() {
		System.out.println("Hello");		
	}

}
