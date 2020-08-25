package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubStringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subStrValues = new ArrayList<String>();
        //int i=0;
       
        
        for(int i=0;i<s.length()-(k);i++)
        {
        	subStrValues.add(s.substring(i,Math.min(i+k, s.length())));        	
        	
        }
        Collections.sort(subStrValues);
        smallest = subStrValues.get(0);
        largest = subStrValues.get(1);
        
       /* for(String j : subStrValues) {
        	System.out.println(j);
        }*/
        
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
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