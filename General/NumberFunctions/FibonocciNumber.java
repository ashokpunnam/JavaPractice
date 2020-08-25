package NumberFunctions;

public class FibonocciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		int j=1;
		
		while(sum<100) {
			sum=i+j;
			i=j;
			j=sum;
			System.out.print(sum+" ");
		}



	}



}
