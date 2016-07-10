package com.rs.polymorphism;

public class VehicleTester {

public static void main(String[] args) {
	Vehicle[] vehicles = new  Vehicle[3];
	vehicles[0]= new Cycle();
	vehicles[1]= new Car();
	vehicles[2]= new Truck();
	  
	for(Vehicle veh:vehicles){
		veh.horn();
	}
	
	
}	
	
	
}
