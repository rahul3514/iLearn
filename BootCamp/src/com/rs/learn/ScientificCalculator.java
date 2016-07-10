package com.rs.learn;

public class ScientificCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Scientific");
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double powerOf(int a, int b) {
		return Math.pow(a, b);
	}
}
