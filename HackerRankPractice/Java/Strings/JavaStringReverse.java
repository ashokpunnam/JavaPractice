import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String result = "";
        for(int i=0;i<A.length();i++) {
        	result = result+A.charAt(A.length()-i-1);
        }
        if(A.equals(result)) {
        	System.out.println("Yes");
        }
        
    }
}



