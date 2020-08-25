
package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printFibonocciNumber(100);		
		//printPrimeNumbers();
		//printOddNumbers();
		
		//stringPalindrome("madam");
		//intPalindrome(152);
		/*int x=10;
		int y=20;
		swapNumbersWithoutThird(x,y);
		System.out.print("x:"+x+"-"+"y:"+y);*/
		
		//checkArmStrongNumber(370);
		
		int[] arr = {23,56,57,89,23};
		int[] unsorted = { 32, 23, 45, 87, 92, 31, 19 };
		rotateArrayByNPlaces();
		
		//secondMax(arr);
		//System.out.println(factorial(3));
		//removeDuplicates();
		//removeDuplicates(arr);
		//bubbleSort(unsorted);
		insertionSort(unsorted);
		

	}
	
	public static void printFibonocciNumber(int limit) {
		int j=1;
		int k = 1;
		int sum=0;
		System.out.print("Fibonocci Series is: ");
		
		while(sum<limit) {			
			sum = sum+j;
			j = k;
			k=sum;
			//firstNum = sum;
			System.out.print(sum + "-");
			
		}
		
	}
	
	public static void printPrimeNumbers() {
		for(int i=1;i<=100;i++) {
			 if(isPrime(i)) {
				 System.out.print(i+"-");
			 }
			}
				
		
	}
	
	public static boolean isPrime(int n) {
		//boolean flag = true;
		for(int i=2; i<=(n/2); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void printOddNumbers() {
		int i=1;
		while(i<=100) {
			System.out.print(i+"-");
			i+=2;
		}
	}
	
	
	public static void stringPalindrome(String str){	
		//String t1 = "madam";
		char[] item = str.toCharArray();
		char temp[] = new char[item.length];
		int j=0;
		
		for(int i=(item.length-1);i>=0;i--) {
			temp[j] = item[i];
			j++;
		}
		
		//System.out.print(t+"-"+);
		
		if(str.equals(String.valueOf(temp))) {
			System.out.print("Polyndrome");
		}
		else {
			System.out.print("Not a Polyndrome");
			
		}
		
	}
	
	public static void intPalindrome(int n) {
		
		int tempNumber = n;
		int remainder=0;
		//int divisor=0;
		int palNumber=0;
		while(tempNumber>0) {
			remainder = tempNumber%10;
			palNumber = palNumber*10+remainder;
			tempNumber = tempNumber/10;
		}
		
		if(palNumber==n) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not a Polindrome");
		}
		
	}
	
public static void swapNumbers(int x, int y) {
		
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.print("x:"+x+"-"+"y:"+y);		
		
	}

public static void swapNumbersWithoutThird(int x, int y) {
	
	x=x+y;
	y=x-y;
	x=x-y;	
	System.out.print("x:"+x+"-"+"y:"+y);		
	
}

public static void checkArmStrongNumber(int n) {
	
	int tempNumber=0;
	int remainder = 0;
	int a=n;
	
	while(a>0) {
		remainder = a%10;
		tempNumber = tempNumber+(remainder*remainder*remainder);
		a=a/10;
	}
	if(tempNumber==n) {
		System.out.println("ArmStrongNumber");
	}
	else {
		System.out.println("Not an ArmStrongNumber");
	}
	
	
}

public static void secondMax(int[] arr) {
	//Arrays.sort(arr);
	int largest = 0;
	int secondLargest = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondLargest=largest;
			largest = arr[i];			
		}
		
	}
	System.out.println("2nd largest number: "+ secondLargest);
	
}

	public static int factorial(int n) {
		//return n;
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
	
	public static void removeDuplicates() {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(7);
		
		Set<Integer> linkedSet = new LinkedHashSet<>();
		
		linkedSet.addAll(list);
		
		for(Integer s: linkedSet) {
			System.out.println(s);
		}
		
	}
	
	public static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int k=0;
		int[] tempArray = new int[arr.length-1];
		for(int i=0;i<(arr.length-1);i++) {
			if(arr[i] == arr[i+1]) {
				continue;
			}
			else {
				tempArray[k] = arr[i];
				k++;
			}
		}
		
		for(int i=0; i<tempArray.length;i++) {
			System.out.println(tempArray[i]);
		}
	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<(arr.length);i++) {
			for(int j=(i+1); j<arr.length;j++) {
				int temp=0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}	
			}
					
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length; i++) {
			int current = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>current) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]=current;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void rotateArrayByNPlaces() {
		int n=2;
		int[] arr = {1,3,4,5,6,7,8};
		for(int i=0;i<n;i++){
			int temp = arr[i];
			for(int j=i+1;j<arr.length;j++){
				swap(arr,i,j);
			}
			arr[arr.length-1] = temp;

		}
		for (int i : arr){
			System.out.print(i+" ");

		}

		
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
