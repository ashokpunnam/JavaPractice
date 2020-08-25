package Lambda;

import java.sql.SQLOutput;

public class TestMain {
    public static void main(String[] args) {
       MathOperation add = (a,b) -> a+b;
       MathOperation substract = (a,b) -> a-b;
       MathOperation multiply = (a,b) -> a*b;
       MathOperation div = (a,b) -> a/b;
       int onScreenNumber = 0;
       onScreenNumber = calculate(5,add,2);
       onScreenNumber = calculate(onScreenNumber,substract,3);
       onScreenNumber = calculate(onScreenNumber,multiply,7);
        onScreenNumber = calculate(onScreenNumber,add,2);
       onScreenNumber = calculate(onScreenNumber,div,3);

        System.out.println(onScreenNumber);
        }

        private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
        }

        GreetingService g1 = null;



}
