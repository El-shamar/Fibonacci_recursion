package com.tecgle.noble.fibonacci;

public class Fibonacci {

	public static long getFibonacci(int i) {
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		long numFibonacci = getFibonacci(i - 1) + getFibonacci(i - 2);
		return numFibonacci;
	}

}
