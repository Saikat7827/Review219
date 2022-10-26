package com.bridgelabz;

import java.util.Scanner;

public class StringCount {
	 void name() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String s1 = sc.next();
		System.out.println("Enter second name");
		String s2 = sc.next();
		String s = s1+" "+s2;
		//System.out.println(s1+" "+s2);
		System.out.println(s);
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		 StringCount obj = new StringCount();
		 obj.name();
		
		
	}
}
