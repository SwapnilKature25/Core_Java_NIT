package com.nit.interfaces.day4;

@FunctionalInterface
interface NIT1 {
	int square(int x);

	default int add(int a, int b) {
		return a + b;
	}

	default int sub(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static int divide(int a, int b) {
		return a / b;
	}
}

public class FunctionalInterface4 implements NIT1 {
	public static void main(String[] args) {
		int a = 25;
		int b = 5;
		FunctionalInterface4 fun = new FunctionalInterface4();
		int add = fun.add(a, b);
		int sub = fun.sub(a, b);
		int mul = NIT1.multiply(a, b);
		int div = NIT1.divide(a, b);
		System.out.println(add + " " + sub + " " + mul + " " + div + " " + fun.square(6));  // 30 20 125 5 36
	}

	@Override
	public int square(int x) {
		return x * x;
	}
}
