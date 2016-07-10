package com.rs.learn;

public class CalcTester {
	
	
	public static void main(String[] args) {
		CalcTester test = new CalcTester();
		
		/*Calculator calc = new NormalCalculator();
		Calculator scCalc = new ScientificCalculator();

		calc.sum(10, 20);
		scCalc.sum(30, 20);*/
		
		Calculator[] calculators = new Calculator[2];
		calculators[0] = new NormalCalculator();
		calculators[1]= new ScientificCalculator();
		test.sum(calculators);
	}
	
	public void sum(Calculator[] calcs){
		for(Calculator calc :calcs){
			System.out.println(calc.sum(30,40));
		}
	}
	
	
}
