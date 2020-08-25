package ObjectOrientedProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class JavaInterface {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	char tempArrayA[] = a.toLowerCase().toCharArray();
    	Arrays.sort(tempArrayA);
    	
    	char tempArrayB[] = b.toLowerCase().toCharArray();
    	Arrays.sort(tempArrayB);
    	
    	if(new String(tempArrayA).equals(new String(tempArrayB))) {    		
    		return true;
    	}
    	return false;
    	
    	
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
