package StringFunctions;
import java.util.Arrays;
import java.util.Scanner;

public class JavaLoops2 {
   

  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      int t=in.nextInt();
      for(int i=0;i<t;i++){
          int a = in.nextInt();
          int b = in.nextInt();
          int n = in.nextInt();
          int index=1;
          int sum = a;
          for(int j=0;j<n;j++)
          {
          sum = sum+(index*b);
          index = index*2;
          System.out.print(sum+" ");
          }        
          System.out.print("\n");
          
      }
  }
}
