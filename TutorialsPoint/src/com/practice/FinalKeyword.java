package com.practice;

public class FinalKeyword {
	/*final String name;
	
	public FinalKeyword() {
		name = "Suraj";
	}*/
	static final String name;
	
	static {name = "India";}
	
	public static void main(String[] args) {
		//FinalKeyword fk = new FinalKeyword();
		System.out.println(FinalKeyword.name);
		FinalKeyword.display(3);
	}

	static void display(final int i){
		System.out.println(i);
	}
}
