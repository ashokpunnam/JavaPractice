import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TwoStrings());
	}
	
	public static String TwoStrings() {
		String s1="hello"; 
		String s2="world";
        String[] temp = s1.split("");
        for(int i=0; i<temp.length;i++){
            if(s2.contains(temp[i])){
                return "YES";
            }
        }
        return "NO";
	}
	

	}

