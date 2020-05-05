package NumberFunctions;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] primenumbers = new int[50];
		for(int i=1;i<=100;i++) {
			if(PrimeCheck(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	public static boolean PrimeCheck(int n) {
		for(int i=2;i<=(n/2);i++) {
			if(n%i==0) {
				return false;
			}
		
		}
		return true;
	}

}
