package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubStringComparison2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        //int i=0;
       
        
        for(int i=0;i<s.length()-(k-1);i++)
        {
            String curr = s.substring(i,i+k);
            if(smallest.compareTo(curr)>0)  {
                smallest = curr;
            } 
            if(largest.compareTo(curr)<0){
                largest = curr;
            }       
            
        }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
       // getSmallestAndLargest();
      
       System.out.println(getSmallestAndLargest(s, k));
    }
}