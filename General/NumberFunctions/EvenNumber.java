package NumberFunctions;

import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,1,2,3,4};
		//removeDuplicates(arr);

		reverseNumber(143);
		arrayList();

	}
	public static void printEvenNumber(){
		int i=1;
		while(i<=100) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}

			i+=1;
		}
	}

	public  static void removeDuplicates(int[] t){
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
				//Arrays.asList(t);
		for(int i=0; i<t.length;i++){
			list.add(t[i]);
			System.out.print(list.get(i)+" ");
		}
		set.addAll(list);

		for(int i : set){
			System.out.println(i);
		}

	}

	public static void reverseNumber(int n){
		int sum = 0;
		int remainder = 0;

		while(n>0){
			remainder = n%10;
			sum = sum*10+remainder;
			n = n/10;
		}
		System.out.println(sum);

	}

	public static void arrayList(){
		ArrayList list = new ArrayList();
		list.add("20");
		list.add("30");
		list.add("40");
		Iterator itr = list.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		for(Object i : list){
			System.out.println(i);
		}
	}

}
