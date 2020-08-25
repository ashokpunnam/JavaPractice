package DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for(int row=0; row<n;row++) {
        	int colSize = scan.nextInt();
        	ArrayList<Integer> list = new ArrayList();
        	for(int col=0; col<colSize; col++ ) {
        		list.add(scan.nextInt());
        	}
        	lists.add(list);
        }
        
        int queries = scan.nextInt();
        
        for(int i=0; i<queries; i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	ArrayList<Integer> list = lists.get(x-1);
        	if(y<=list.size()) {
        		System.out.println(list.get(y-1));
        	}
        	else {
        		System.out.println("ERROR!");
        	}
        }
       

    }
}