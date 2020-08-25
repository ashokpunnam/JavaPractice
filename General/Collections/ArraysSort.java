package Collections;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Ashok","Rani","Jasnitha","Jaishna"};
		//Arrays.sort(arr);
		GenericSort<String> sort = new GenericSort<>();
		sort.sortGeneric(arr);
		for(String i : arr)
		
		System.out.println(i);

	}

}

class GenericSort<T>{	
	
	public void sortGeneric(T[] t){
		Arrays.sort(t);
	}
}


