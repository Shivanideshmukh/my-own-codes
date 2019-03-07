package com.practice;

class Bike{
	int speed = 150;
}

public class RuntimePolyEx extends Bike{
	int speed = 100;
	
	public static void main(String[] args) {
		Bike b = new Bike();
		Bike b1 = new RuntimePolyEx();
		RuntimePolyEx r = new RuntimePolyEx();
		//RuntimePolyEx r1 = new Bike(); cannot convert from bike to RuntimePolyEx
		
		System.out.println(b.speed);
		System.out.println(b1.speed);
		System.out.println(r.speed);

	}

}
