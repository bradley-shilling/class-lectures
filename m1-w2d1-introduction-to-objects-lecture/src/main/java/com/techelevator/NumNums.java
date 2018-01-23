package com.techelevator;

import java.util.Arrays;

public class NumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int x = 0;
		System.out.println(i == x);
		
		int[] nums = new int[] {1, 2, 3};
		int[] newNums = new int[] {1, 2, 3};
		
		System.out.println(nums == newNums);
		System.out.println(nums[0] == newNums[0]);
		
		
		
		System.out.println(Arrays.equals(nums, newNums));
		
		String name = "joe";
		String longName = new String(new char[] {'j', 'o', 'e'});
		
		System.out.println(name == longName);
		System.out.println(name.equals(longName));
		
		String nothing = null;
		String empty = "";
		
		if (nothing != null) {
			nothing.equals(empty);
		}
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		
		System.out.println(name.substring(1,2).toUpperCase());
		
		name = "Java Joe";
		if (name.contains("Java")) {
			System.out.println( "has java");
			System.out.println("Has java at " + name.indexOf("Java"));
			int startOfJava = name.indexOf("Java");
			String nameWithoutJava = name.substring(0, startOfJava) + name.substring(startOfJava +4);
			
			System.out.println("Also Contains " + nameWithoutJava );
			System.out.println("or " + name.replace("Java",""));
				
		}
		
		String first = "Hello";
		String second = "hello";
		
		System.out.println(first.equals(second));
		System.out.println(first.equalsIgnoreCase(second));
		
		String line = "Joe,Erickson,joe@tech.com";
		// split string into array
		String[] parts = line.split(",");
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
		
		System.out.println(String.join("|", parts));
		

	}

}
