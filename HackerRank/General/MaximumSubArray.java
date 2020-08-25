package General;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] intArray = new int[n];
        int min=0;
        int max=0;
        int curr=0;

        for(int i=0; i<n; i++){
            intArray[i] = scan.nextInt();
        }
        scan.close();

        min = intArray[0];
        for(int i=0; i<n; i++){
            curr=0;
            for(int j=i; j<n;j++){
                curr = curr+intArray[j];
                if(curr>max){
                    max = curr;
                }
            }
        }

        System.out.println(max);

    }
}
