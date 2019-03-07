package com.practice;

interface Printable2 {
	void print();
}

interface Showable2 {
	void print();
}

interface Writable extends Printable2,Showable2{
	void write();
}

class Test implements Printable2, Showable2,Writable {

	@Override
	public void print() {
		System.out.println("Print in test");		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
}
class Test1 implements Printable2, Showable2{

	@Override
	public void print() {
		System.out.println("Print in Test1");
		
	}	
}


public class InterfaceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
