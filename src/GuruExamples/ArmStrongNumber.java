package GuruExamples;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArmStrongNumber();

		if (ArmStrongNumber(9)) {
			System.out.println("Given Number is an armstrong number");
		} else {
			System.out.println("Given Number is not an armstrong number");
		}
	}

	public static Boolean CheckArmstrong(int n) {
		String[] temp = String.valueOf(n).split("");
		int power = temp.length;
		int calculatedNumber = 0;
		for (int i = 0; i < power; i++) {
			calculatedNumber = (int) (calculatedNumber + Math.pow(Integer.parseInt(temp[i]), power));
		}

		System.out.println("calculatedNumber" + calculatedNumber);
		if (calculatedNumber == n) {
			return true;
		}

		return false;
	}

	public static boolean ArmStrongNumber(int n) {
		int tempNumber = 0;
		int digits = 0;
		int digitsSum = 0;
		tempNumber = n;
		while (tempNumber != 0) {
			digits = tempNumber % 10;
			digitsSum = digitsSum + digits * digits * digits;
			tempNumber = tempNumber / 10;
		}
		if (digitsSum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void GuruArmStrong(int inputArmstrongNumber) {
		int tempNumber, digit, digitCubeSum = 0;

		tempNumber = inputArmstrongNumber;
		while (tempNumber != 0) {

			/*
			 * On each iteration, remainder is powered by thetempNumber of digits n
			 */
			System.out.println("Current Number is " + tempNumber);
			digit = tempNumber % 10;
			System.out.println("Current Digit is " + digit);
			// sum of cubes of each digits is equal to thetempNumber itself
			digitCubeSum = digitCubeSum + digit * digit * digit;
			System.out.println("Current digitCubeSum is " + digitCubeSum);
			tempNumber /= 10;

		}

		// check giventempNumber and digitCubeSum is equal to or not
		if (digitCubeSum == inputArmstrongNumber)
			System.out.println(inputArmstrongNumber + " is an Armstrong Number");
		else
			System.out.println(inputArmstrongNumber + " is not an Armstrong Number");

	}
	
	public static void PrintArmStrongNumber() {
		//int armStrong=0;
		int tempNumber, digit, digitCubeSum;
		 
        for (int inputArmstrongNumber = 0; inputArmstrongNumber < 1000; inputArmstrongNumber++) {
            tempNumber = inputArmstrongNumber;
            digitCubeSum = 0;
            while (tempNumber != 0) {
 
                /* On each iteration, remainder is powered by thetempNumber of digits n
                 */
 
                digit = tempNumber % 10;
 
                //sum of cubes of each digits is equal to thetempNumber itself
                digitCubeSum = digitCubeSum + digit * digit * digit;
 
                tempNumber /= 10;
 
            }
 
            //check giventempNumber and digitCubeSum is equal to or not 
            if (digitCubeSum == inputArmstrongNumber)
                System.out.println(inputArmstrongNumber + " is an Armstrong Number");
 
        }
 
    }
}
