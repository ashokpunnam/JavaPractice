package collections_practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        /*List<Integer> list = New ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(ar[i]);
        }*/

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int counter=1;
            if(map.containsKey(ar[i])){
                counter = map.get(ar[i])+1;
            }
            map.put(ar[i],counter);
        }
        int counter=0;
        for(Map.Entry i : map.entrySet()){
            int value = Integer.parseInt(i.getValue().toString());
            counter = counter+(value/2);
            System.out.println("key:"+i.getKey()+"value:"+value+"counter:"+counter);

        }
        return counter;


    }

;

    public static void main(String[] args) throws IOException {
        int n=10;
        int[] ar = {1,1,3,1,2,1,3,3,3,3};
        int result = sockMerchant(n, ar);

        }


    }


