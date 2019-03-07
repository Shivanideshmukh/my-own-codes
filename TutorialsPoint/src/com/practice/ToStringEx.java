package com.practice;

public class ToStringEx {

	String name;
	int rollno;
	ToStringEx(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		ToStringEx s1 = new ToStringEx("John", 101);
		ToStringEx s2 = new ToStringEx("Steve", 102);
		System.out.println(s1);
		System.out.println(s1.toString());

	}

}
