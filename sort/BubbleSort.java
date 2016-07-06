package com.datastructure.sort;

public class BubbleSort {
	
	int[] values = {14,33,27,35,10};
	
	public static int count = 0;
	
	
	public void perform(){
		for(int i=0;i<values.length;i++){
			System.out.println("I  >> " + i);
			for(int j=0; j <values.length-1;j++){
				count++;
				if(values[j+1] < values[j]) {
					swap(j,j+1);
				}
			}
			
		}
		System.out.println("After Sorting :: >> in COUNT >> " + count);
		for(int value : values){
			System.out.print(value + " ");
		}
		 
		
		
		
	}


	private void swap(int i, int j) {
		values[i] = values[i] + values[j];
		values[j] = values[i] - values[j];
		values[i] = values[i] - values[j];
	}
	
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.perform();
	}
}
