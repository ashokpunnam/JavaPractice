package Lambda;

public class LambaTest {
    public static void main(String[] args) {
        GreetingService g1 = (String name)-> System.out.println("Hi "+name);
        g1.greet("Ashok");
    }
}
