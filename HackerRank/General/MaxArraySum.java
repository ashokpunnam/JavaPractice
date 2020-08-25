package General;

import java.util.Scanner;

public class MaxArraySum {
    public static void main(String[] args) {
       // int[] intArray = {-2, 1, 3, -4, 5};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] intArray = new int[n];
        int currSum = 0;
        int maxSum = 0;

        for(int i=0; i<n; i++){
            intArray[i] = scan.nextInt();
        }
        scan.close();

        for(int i=0; i<intArray.length; i++){
            int j=i+2;
            currSum = intArray[i];
            while(j<intArray.length){
                currSum = currSum+intArray[j];
                //System.out.println(currSum+" "+ maxSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
                j=j+2;

            }

        }
        System.out.println(maxSum);

    }
}

