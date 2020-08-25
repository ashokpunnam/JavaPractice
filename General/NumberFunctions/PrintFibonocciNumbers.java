package NumberFunctions;

public class PrintFibonocciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int previousNumber=0;
		int nextNumber=1;
		
		for (int i=0;i<=10;i++) {
			System.out.println("Fibonicci "+previousNumber);
			int sum = previousNumber+nextNumber;
			previousNumber=nextNumber;
			nextNumber=sum;
			
		}
			
	}

}
