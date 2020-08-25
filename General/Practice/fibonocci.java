package Practice;

public class fibonocci {
    public static void main(String[] args) {
        fibonoci(100);

    }

    public static void fibonoci(int n){
        int a=0, b=0, c=1;
        System.out.print("Fibonocci Numbers are::");
        while (c<=n){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
        }

    }
}
