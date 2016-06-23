package com.datastructure.search;

public class BinarySearch {
	
	int[] sortedValues = new int[] {2,4,9,10,15,31,42,53,61};
	
	private static int count=0;
	
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.search(9);
	}


	public void search(int n){
		int minIndex = 0;
		int maxIndex = sortedValues.length-1;
		
		
		doASearch(n, minIndex, maxIndex);
	}


	private void doASearch(int itemToFound, int minIndex, int maxIndex) {
		count++;
		int mid = minIndex + ((maxIndex - minIndex)/2);
		
		if(mid  > (sortedValues.length-1)){
			System.out.println("NOT FOUND");
			return;
		}
		else if(sortedValues[mid] == itemToFound){
			System.out.println("Found Item at " + mid +".... in " + count);
			return;
		}
		else if(itemToFound > sortedValues[mid]){
			// Found on the right
			minIndex = mid +1;
			doASearch(itemToFound, minIndex, maxIndex);
		}
		else if(itemToFound < sortedValues[mid]){
			// Found on the Left
			maxIndex = mid -1;
			doASearch(itemToFound, minIndex, maxIndex);
		}
	}
}
