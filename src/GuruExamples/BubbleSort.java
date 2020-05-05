package GuruExamples;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arrayOfNumbers = new int[n];
		
		for(int i=0; i<n; i++) {
			arrayOfNumbers[i] = scan.nextInt();
		}
		int[] tempArray = new int[arrayOfNumbers.length];
		tempArray = Swap(arrayOfNumbers);
		for(int i=0; i<arrayOfNumbers.length; i++) {
			//System.out.println("Sorted numbers: "+arrayOfNumbers[i]);
			
			System.out.println(tempArray[i]);
		}
		
	}
	
	public static int[] Swap(int[] arrayOfNumbers) {		
		int max=0; int min=0;
		int len = arrayOfNumbers.length; 
		for (int i=0; i<len;i++) {
			for(int j=1; j<(len-i);j++) {
				if(arrayOfNumbers[j-1]>arrayOfNumbers[j]) {
					max = arrayOfNumbers[j-1];
					arrayOfNumbers[j-1] = arrayOfNumbers[j];
					arrayOfNumbers[j] = max;
				}
			}
			
		}
		return arrayOfNumbers;
		
	}

}
