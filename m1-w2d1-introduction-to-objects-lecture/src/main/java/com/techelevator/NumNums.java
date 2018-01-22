package com.techelevator;

import java.util.Arrays;

public class NumNums {

	public static void main(String[] args) {
		int i = 0;
		int x = 0;
		
		System.out.println(i == x);
		
		int[] nums = new int[] {1,2,3};
		int[] newNums = new int[] {1,2,3};
		
		System.out.println(nums == newNums);
		
		int[] numNums = nums;
		
		System.out.println(nums == numNums);
		
		System.out.println(Arrays.equals(nums, newNums));
		
		String name = "joe";
		String longName = new String(new char[] {'j','o','e'});
		
		System.out.println(name == longName);
		
		System.out.println(name.equals(longName));
		
		String nothing = null;
		String empty = "";
		
		if(nothing != null) {
			nothing.equals(empty);
		}
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		//name = name.toUpperCase();
		System.out.println(name);
		
		System.out.println(name.substring(1));
		System.out.println(    name.substring(1, name.length()).toUpperCase()    );
		
		name = "There is Java Joe";
		if(name.contains("Java")) {
			System.out.println("Has Java at " + name.indexOf("Java"));
			int startOfJava = name.indexOf("Java");
			String nameWithoutJava = name.substring(0, startOfJava) + name.substring(startOfJava + 4);
			System.out.println("Also contains " + nameWithoutJava);
			
			System.out.println("Or " + name.replace("Java ", ""));
		}
		
		name.startsWith("Java");
		name.endsWith("Java");
		
		String first = "Hello";
		String second = "hello";
		
		System.out.println(first.equals(second));
		System.out.println(first.equalsIgnoreCase(second));
		
		String line = "Joe,Erickson,joe@tech.com";
		String[] parts = line.split(",");
		
		String firstName = parts[0];
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);

		System.out.println(String.join("|", parts));
		
	}

}
