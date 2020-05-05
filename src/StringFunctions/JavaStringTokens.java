package StringFunctions;
import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //s.replaceAll("?", " ");
        s = s.replace(", "," ");
        System.out.println(s);
        // Write your code here.
        String[] strArray = s.split("[ !,?\\.\\_'@]+");
        		//s.split("[^a-zA-Z]+");
        		//s.split("\\t|'| |,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/");
        		//s.split("\\s*(,|'|\\?| )\\s*");        
        System.out.println(strArray.length);
        for(int i=0; i<strArray.length;i++) {
        	System.out.println(strArray[i]);
        }
        scan.close();
    }
}

