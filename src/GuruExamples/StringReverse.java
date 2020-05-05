package GuruExamples;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String"+StringReverse("Reverse"));
	}
	
	public static String StringReverse(String str) {
		String[] str1 = str.split("");
		int length = str.length();
		String temp="";
		
		for(int i=(length-1);i>=0;i--) {
			//str1[i]
			temp=temp+str1[i];
		}
		return temp;
	}

}
