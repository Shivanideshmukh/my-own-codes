package com.learn;

public class StringBufferMethods{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("available");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
		FinalClassEmployee fce = new FinalClassEmployee("100");
		System.out.println(fce.pancardNumber);
		FinalClassEmployee fce1 = new FinalClassEmployee("1001");
		System.out.println(fce1.pancardNumber);
		
	}

}
