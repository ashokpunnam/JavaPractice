package NumberFunctions;

import java.util.Scanner;

public class Integerpolyndrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int tempNumber = n;
        int remainder=0;

        while(tempNumber>0){
            remainder = tempNumber%10;
            sum = sum*10+remainder;

            tempNumber = tempNumber/10;

        }
        if(sum == n){
            System.out.println("Number is polyndrome");
        }
        else{
            System.out.println("not a plyndrome Number");
        }
    }
}
