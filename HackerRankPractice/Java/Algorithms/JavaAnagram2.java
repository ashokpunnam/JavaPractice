import java.util.Scanner;

public class JavaAnagram2 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	char[] charArray = a.toCharArray();
    	int length = charArray.length;
    	
    	for(int i=0;i<length;i++){
    		   for(int j=i+1;j<length;j++){
    		      if (charArray[j] <= charArray[i]) {
    		          char temp = charArray[i];
    		          charArray[i]=charArray[j];
    		          charArray[j]=temp;
    		      }
    		   }
    		}
    	
    	char[] charArray1 = b.toCharArray();
    	int length1 = charArray.length;
    	
    	for(int i=0;i<length1;i++){
 		   for(int j=i+1;j<length1;j++){
 		      if (charArray1[j] <= charArray1[i]) {
 		          char temp = charArray1[i];
 		         charArray1[i]=charArray1[j];
 		        charArray1[j]=temp;
 		      }
 		   }
 		}    	
    	
    	if(new String(charArray).toLowerCase().equals(new String(charArray1).toLowerCase())) {
    		return true;
    	}
        
        return false;
        
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
