package NumberFunctions;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();
		System.out.println("Random Int"+randomNumber.nextInt(100));
		System.out.println("Random Double"+randomNumber.nextDouble());
		System.out.println("Random Float"+randomNumber.nextFloat());
		System.out.println("Random Long"+randomNumber.nextLong());
		
		System.out.println("Using Math Random"+Math.random()*100);

	}

}
