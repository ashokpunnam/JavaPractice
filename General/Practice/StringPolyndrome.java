package Practice;

public class StringPolyndrome {
    public static void main(String[] args) {
        stringPolyndrome("bob1");

    }
    public static void stringPolyndrome(String s){
        char[] charArray = s.toCharArray();
        String polyndrome = "";
        for(int i=charArray.length-1;i>=0;i--){
            polyndrome = polyndrome+charArray[i];
        }
        if(polyndrome.equalsIgnoreCase(s)){
            System.out.println("String s::"+s+"::Poly::"+polyndrome);
            System.out.println("Yes! Polyndrom");
        }
        else{
            System.out.println("String s::"+s+"::Poly::"+polyndrome);
            System.out.println("NO!! Not a polyndrome");
        }

    }
}
