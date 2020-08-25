package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
       int[] intArr = {1,2,3,4,3,4,3,2,1};

        removeDuplicates(intArr);

    }

    public static void removeDuplicates(int[] intArr){
        Set<Integer> set = new HashSet<>();
        for(int i:intArr){
            set.add(i);
        }
        for(int i:set){
            System.out.println(i);
        }


    }

}


