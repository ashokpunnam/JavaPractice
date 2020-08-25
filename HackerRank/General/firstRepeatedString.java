package General;

import java.util.Arrays;
import java.util.Scanner;

public class firstRepeatedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] charArray = s.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for(int i=1;i<charArray.length;i++){
                if(charArray[i-1] == charArray[i]){
                    System.out.println("First Repeated character:"+charArray[i]);
                    break;
                }

        }

    }
}
