package GuruExamples;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IsPalindromeNumber(122);
		
		PalindromeNumberInteger(121);
		
		

	}
	
	public static void IsPalindromeNumber(int n) {
		String[] paliNumber = String.valueOf(n).split("");
		int len = paliNumber.length;
		String temp="";
		for(int i = (len-1); i>=0; i-- ) {
			temp = temp+paliNumber[i];
			//System.out.print(temp);
		}
		if(Integer.parseInt(temp)==n) {
			System.out.println(n+" Is a Polindrome Number");
		}
		else {
			System.out.println(n+ "Is not a Polindrome Number");
		}
	}
	
	public static void PalindromeNumberInteger(int n) {
		int temp=0;
		int digits=0;
		int sumDigits=0;
		temp=n;
		while(temp !=0) {
			digits = temp%10;
			sumDigits = sumDigits*10+digits;
			System.out.print(sumDigits+" ");
			temp = temp/10;
		}
		System.out.println("Poly"+sumDigits);
		
		if(sumDigits==n) {
			System.out.println(n+" Is a Polindrome Number");
		}
		else {
			System.out.println(n+ "Is not a Polindrome Number");
		}		
	}

}
