package com.vstl.loops;

public class primenumber {
public static boolean isprimenumber (int num) {
		if (num<=1){
			return false;
			}
		for (int i=2;i<num;i++) {
			if (num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("2 is prime number:"+isprimenumber(2));
		System.out.println("6 is prime number:"+isprimenumber(6));
		System.out.println("24 is prime number:"+isprimenumber(24));
		System.out.println("13 is prime number:"+isprimenumber(13));
		System.out.println("56 is prime number:"+isprimenumber(56));
		System.out.println("98 is prime number:"+isprimenumber(98));
		System.out.println("19 is prime number:"+isprimenumber(19));
		System.out.println("17 is prime number:"+isprimenumber(17));
	}
}

