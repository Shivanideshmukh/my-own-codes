package com.exception;

public class NestedTryEx {

	public static void main(String[] args) {
		try {
			try{
				int b =30/0;
				System.out.println(b);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] =new int[5];
				a[5] = 4;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("other Statement");
		}
		catch (Exception e) {
			System.out.println("handled");
		}
		System.out.println("normal flow");
	}

}
