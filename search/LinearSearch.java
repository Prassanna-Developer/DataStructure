package com.datastructure.search;

import java.util.Scanner;

/**
 * Implemented the Logic Using Arrays 
 *
 */
public class LinearSearch {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Total N values:");
		int n = scanner.nextInt();
		int[] items = new int[n];
		
		System.out.println("Enter the values here :");
		for(int i=0;i<items.length;i++){
			items[i] = scanner.nextInt();
		}
		System.out.println("Enter the Value to find ");
		int valueToFind = scanner.nextInt();
		
		
		searchItem(items, valueToFind);
		
	}
	
	
	private static void searchItem(int[] list,int value){
		for(int i=0;i<list.length;i++){
			if(list[i] == value){
				System.out.println("Found The value > " + value + " at Index > " + ++i);
				break;
			}
		}
		
	}

}
