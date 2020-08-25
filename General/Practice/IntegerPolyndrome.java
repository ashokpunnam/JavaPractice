package Practice;

public class IntegerPolyndrome {
    public static void main(String[] args) {
        integerPolyndrome(172);
    }
    public static void integerPolyndrome(int n){
        int remainder=0;
        int tempSum=n;
        int sum=0;

        while(tempSum>0){
            remainder = tempSum%10;
           // System.out.println("tempSum"+tempSum);
            sum = remainder+sum*10;
            tempSum = tempSum/10;
        }
        if(sum == n){
            System.out.println("Yes!! Polyndrome"+sum);
        }
        else{
            System.out.println("No!! Not Polyndrome"+sum);
        }

    }
}
