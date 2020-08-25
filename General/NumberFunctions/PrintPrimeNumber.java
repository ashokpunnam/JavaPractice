package NumberFunctions;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			int counter=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					counter=counter+1;
				}				
			}
			if(counter==2) {
				System.out.println("prime Numbers are: "+i);
			}
		}
	}
	
}
