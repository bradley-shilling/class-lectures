package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BestLecture {
	
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		
		//standard for loop
		for(int i =0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// for each loop (Prints out all elements in nums)
		for(int element : nums) {
			System.out.println(element);
		}
		
		String[] names = new String[] {"joe", "eran", "bethany"};
		for(String name : names) {
			System.out.println(name);
		}	
		
		// Autoboxing
		Double price = 3.50;
		double newPrice = 4.50;
		
		price = newPrice;
		newPrice = price;
		
		// Collections
		//list
		List<String> students = new ArrayList<String>();
		// add value to list
		students.add("James");
		students.add("Pete");
		students.add("Steve");
		
		
		
		//get entire list (adds square brackets)
		System.out.println(students);
		
		// get specific index value
		System.out.println(students.get(0));
		
		// add to list at specific index value
		students.add(1, "Sam");
		
		for(String name : students) {
			System.out.println(name + ", ");
		}
		
		//turn list into array
		students.toArray();
		
		// remove object from list
		students.remove("Pete");
		System.out.println(students);
		students.remove(0);
		System.out.println(students);
		
		//
		//
		//Set
		Set<Integer> portNumbers = new HashSet<Integer>();
		
		portNumbers.add(80);
		portNumbers.add(8080);
		portNumbers.add(443);
		
		// print all numbers in set
		System.out.println(portNumbers);
		
		// all values must be unique
		portNumbers.add(80);
		System.out.println(portNumbers);
		
		//remove
		portNumbers.remove(80);
		System.out.println(portNumbers);
		
		// contains
		portNumbers.contains(443);
		System.out.println(portNumbers.contains(443));
		
		//size
		portNumbers.size();
		System.out.println(portNumbers.size());
		
		//
		//
		// Queues
		
		Queue<String> line = new LinkedList<String>();
		
		//add / offer to queue
		line.offer("bob");
		line.offer("bill");
		line.offer("brad");
		
		System.out.println(line);
		
		// run through queue
		while(! line.isEmpty()) {
			String name = line.poll();
			System.out.println(name);
		}
		
		//
		//
		// Stack
		
		Stack<String> browserHistory = new Stack<String>();
		
		// add to stack
		browserHistory.push("www.google.com");
		browserHistory.push("www.yahoo.com");
		browserHistory.push("reddit.com");
		
		System.out.println(browserHistory);
		
		while(! browserHistory.isEmpty()) {
			String address = browserHistory.pop();
			System.out.println(address);
		}
	}

}
