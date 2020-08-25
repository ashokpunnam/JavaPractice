package NumberFunctions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int intNumber = scan.nextInt();
		
		int counter=0;
		for(int i=2;i<=(intNumber/2);i++) {
			if(intNumber%i==0) {
				counter=counter+1;
			}			
			
		}
		if(counter>=2)
		{
			System.out.println("Number provided is not Prime Number");
		}
		else
		{
			
				System.out.println("Number provided is Prime Number");
			
		}

	}

}
