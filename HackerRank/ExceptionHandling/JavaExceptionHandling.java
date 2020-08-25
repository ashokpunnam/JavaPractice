package ExceptionHandling;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class JavaExceptionHandling {
   

  public static void main(String[] args) {
	  try{
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          System.out.println(a/b);

      }
	  catch(InputMismatchException e) {
		  System.out.println("java.util.InputMismatchException");
	  }
	  catch(ArithmeticException e) {
		  System.out.println("java.lang.ArithmeticException: / by zero");
	  }	  
	  
  }
}
