package com.learn;

public class WrapperClassEx {

	public static void main(String[] args) {
		//Integer const
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		//Integer i2 = new Integer("ten"); NumberFormatException
		System.out.println(i+" "+i1);
		
	}

}
