package General;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberOfHoles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int remainder=0;
        int counter = 0;
        while(n>0){
            remainder = n%10;
            counter = counter+countHoles(remainder);
            n=n/10;

        }

        System.out.println(counter);


    }

    public static int countHoles(int number){
        int holes = 0;

        if(number == 0 || number == 4 || number == 6 || number == 9){
            holes = 1;
        }
        else if(number ==8){
            holes =2;
        }

        return holes;

    }
}
