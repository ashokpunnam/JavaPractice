package com.practice.java;

public class SortAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20,35,-15,7,55,-22,-22};
		
		//BubbleSort(intArray);
		//selectionSort(intArray);
		insertionSort(intArray);
		

	}
	
	public static void BubbleSort(int[] intArray) {
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			for(int i=0; i<lastUnsortedIndex; i++) {
				if(intArray[i]>intArray[i+1]) {
					swap(intArray,i,i+1);
				}
				
			}
		}
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+"_");
			
		}
		
	}
	
	public static void selectionSort(int[] intArray) {
		
		for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex-- ) {
			int largest=0;
			for(int i=1; i<=lastUnsortedIndex;i++) {
				if(intArray[i]>intArray[largest]) {
					largest=i;
				}
			}
			swap(intArray,largest, lastUnsortedIndex);
		}
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+"_");
			
		}
		
	}
	
	public static void insertionSort(int[] intArray) {
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++) {
			
			int newElement = intArray[firstUnsortedIndex];
			int i;
			
			for(i=firstUnsortedIndex; i>0 && intArray[i-1]>newElement;i--) {
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+"_");
			
		}
		
	}
	
	public static void swap(int[] array, int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
