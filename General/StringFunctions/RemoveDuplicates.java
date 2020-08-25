package StringFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] n = {10,10,30,40,50,30};
        removeDuplicates(n, 6);



    }

    public  static  void removeDuplicates(int[] t, int n){
        int[] tempArray = new int[n];
        int j=0;

        for(int i=0; i<n-1; i++){
            if(t[i] != t[i+1]){
                tempArray[j]=t[i];
                j++;
            }
        }

        for(int i=0; i<tempArray.length;i++){
            System.out.println(tempArray[i]);
        }



    }



}
