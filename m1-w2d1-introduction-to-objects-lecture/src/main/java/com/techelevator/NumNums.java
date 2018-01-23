package com.techelevator;

import java.util.Arrays;

public class NumNums {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		int i = 0;
		int x = 0;
		System.out.println(i == x);
		
		int[] nums = new int[] {1, 2, 3};
		int[] newNums = new int[] {1, 2, 3};
		
		System.out.println(nums == newNums);
		System.out.println(nums[0] == newNums[0]);
		
		
=======
		int i = 0;
		int x = 0;
		
		System.out.println(i == x);
		
		int[] nums = new int[] {1,2,3};
		int[] newNums = new int[] {1,2,3};
		
		System.out.println(nums == newNums);
		
		int[] numNums = nums;
		
		System.out.println(nums == numNums);
>>>>>>> 0ad00f79873684b14e0e28730bc69ee93bb876c2
		
		System.out.println(Arrays.equals(nums, newNums));
		
		String name = "joe";
<<<<<<< HEAD
		String longName = new String(new char[] {'j', 'o', 'e'});
		
		System.out.println(name == longName);
=======
		String longName = new String(new char[] {'j','o','e'});
		
		System.out.println(name == longName);
		
>>>>>>> 0ad00f79873684b14e0e28730bc69ee93bb876c2
		System.out.println(name.equals(longName));
		
		String nothing = null;
		String empty = "";
		
<<<<<<< HEAD
		if (nothing != null) {
=======
		if(nothing != null) {
>>>>>>> 0ad00f79873684b14e0e28730bc69ee93bb876c2
			nothing.equals(empty);
		}
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
<<<<<<< HEAD
		
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
		
=======
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
		
>>>>>>> 0ad00f79873684b14e0e28730bc69ee93bb876c2
		String first = "Hello";
		String second = "hello";
		
		System.out.println(first.equals(second));
		System.out.println(first.equalsIgnoreCase(second));
		
		String line = "Joe,Erickson,joe@tech.com";
<<<<<<< HEAD
		// split string into array
		String[] parts = line.split(",");
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
		
		System.out.println(String.join("|", parts));
		

=======
		String[] parts = line.split(",");
		
		String firstName = parts[0];
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);

		System.out.println(String.join("|", parts));
		
>>>>>>> 0ad00f79873684b14e0e28730bc69ee93bb876c2
	}

}
