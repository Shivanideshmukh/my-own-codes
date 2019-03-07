package com.practice;

interface Printable{
	void print();
}

public class InterfaceEx implements Printable {

	public static void main(String[] args) {
		InterfaceEx obj1 = new InterfaceEx();
		Printable obj2 = new InterfaceEx();
		//InterfaceEx obj3 = new printable();
		//printable obj4 = new printable();
		obj1.print();
		obj2.print();
	}

	@Override
	public void print() {
		System.out.println("Hello in class");
		
	}

}
