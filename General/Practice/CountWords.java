package Practice;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        countWords("abcabc");

    }
    public static void countWords(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toLowerCase().toCharArray();

        for(char c: charArray){
            int counter=1;
            if(map.containsKey(c)){
                counter=map.get(c)+1;
            }
            map.put(c,counter);
        }

        for(Map.Entry c: map.entrySet()){
            System.out.println("Key is::"+c.getKey()+" Value is::"+c.getValue());

        }
    }
}
