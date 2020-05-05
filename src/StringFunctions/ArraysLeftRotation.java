package StringFunctions;
import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
        int size         = scan.nextInt();
        int numRotations = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        int rotationSpot = size - 1 - numRotations;
        reverse(array, 0, size - 1);
        //System.out.println("Size-1"+(size-1));
        reverse(array, 0, rotationSpot);
       // System.out.println("rotationSpot"+(rotationSpot));
        reverse(array, rotationSpot + 1, size - 1);
		
		
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
		
		
		
		

	}
	
	private static void reverse(int[] array, int start, int end) {
        if (array == null || start < 0 || start >= array.length || end < 0 || end >= array.length) {
            return;
        }
        while (start < end) {
            swap(array, start++, end--);
        }
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
