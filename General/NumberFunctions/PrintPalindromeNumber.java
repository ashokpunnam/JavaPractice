package NumberFunctions;

import java.util.Scanner;

public class PrintPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int intInputNumber = scan.nextInt();
		int tempNumber=0;
		int a;
		int lastDigit=0;
		a=intInputNumber;
		while(a>0)
		{
			lastDigit = a%10;
			tempNumber = (tempNumber*10)+ lastDigit;
			a=a/10;
		}
		if(intInputNumber==tempNumber) {
			System.out.println("Polindrome Number");
		}
		else{
			System.out.println("Not Polindrome Number");
		}

	}
	
	

}
