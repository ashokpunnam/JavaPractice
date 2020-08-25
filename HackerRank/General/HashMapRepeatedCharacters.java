package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapRepeatedCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();


        for (int i=0; i<charArray.length; i++ ){
            int counter=1;
            if(hashMap.containsKey(charArray[i])){
                counter = hashMap.get(charArray[i])+1;
               // hashMap.put(charArray[i],counter);
            }
            hashMap.put(charArray[i],counter);

    }
       for(Map.Entry j : hashMap.entrySet()){
           if(Integer.parseInt(j.getValue().toString())>1){
               System.out.println(j.getKey()+ "-" +j.getValue());
           }
       }



    }



}
