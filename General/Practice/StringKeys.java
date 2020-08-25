package Practice;

public class StringKeys {
    public static void main(String[] args) {
        stringkeys("abcabc");

    }

    public static void stringkeys(String s){
        char[] charArray = s.toCharArray();
        String subStr = "";
        for(int i=0; i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(String.valueOf(charArray[i]).equalsIgnoreCase(String.valueOf(charArray[j]))){
                    System.out.println(charArray[i]+"::"+charArray[i]+"::"+j);
                    subStr = s.substring(0,j);
                    break;
                }
                System.out.println("subStr"+subStr);
            }
        }
       // System.out.println("subStr"+subStr);

    }
}
