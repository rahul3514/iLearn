package com.rs.learn;

public class NormalCalculator implements Calculator {

	@Override
	public int sum(int a, int b) {
		System.out.println("Normal");
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public int divide(int a, int b) {
		return a/b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

}
