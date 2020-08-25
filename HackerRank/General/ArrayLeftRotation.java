package General;

import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size         = scan.nextInt();
        int numRotations = scan.nextInt();
        int temp = 0;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        for(int i=0;i<numRotations;i++){
           for(int j=0; j<size-1;j++){
               swap(array, i,i+1);
           }
        }

        for(int i: array){
            System.out.print(i+" ");
        }
    }

    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }




}
