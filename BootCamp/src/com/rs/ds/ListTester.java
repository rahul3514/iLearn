package com.rs.ds;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ListTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "gaurav,shagun,rahul,kitu";
		String[] names = name.split(",");
		for(String name1:names){
			System.out.println(name1);
		}
		
	
	
	
	}

	private static void Timer() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				new Prober().probe();

			}
		}, 1000, 5000);
	}

	private static void testLinkedList() {
		List<String> names = new LinkedList<>();
		names.add("gaurav");
		names.add("rahul");
		names.add("shagun");
		names.add("kritika");
		names.add("shalu");

		System.out.println(names);

		if (names.contains("gauri")) {
			System.out.println("there");
		} else {
			System.out.println("not  there");
		}

		names.remove(3);
		System.out.println(names);

		names.remove("shalu");
		System.out.println(names);

		System.out.println(names.indexOf("shagun"));
	}
}
