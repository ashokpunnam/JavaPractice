package General;

import java.util.Scanner;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] strArray = s.split(" ");
        boolean match = false;
        String matchedSrting = "";
        for(int i = 0; i< strArray.length; i++){

            for(int j=i+1; j<strArray.length; j++){
               // System.out.println(strArray[i]);
                if(strArray[i].equals(strArray[j])){
                    //System.out.println(strArray[j]);
                    matchedSrting = strArray[i];
                    match = true;
                   // System.out.println(matchedSrting);
                    break;
                }
            }
            if(match){
                break;
            }
        }
        if(matchedSrting.length()>0){
            System.out.println(matchedSrting);
        }
        else{
            System.out.println("No Match");
        }

    }


}
