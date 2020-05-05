import java.util.Arrays;
import java.util.HashSet;

public class JavaCountingValleys1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		String S = "DDUUUUDD";
		String[] valleys = S.split("");
		int d=0;
		int u=0;
		int level=0;
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(valleys[i].equals("D")) {
				level--;
			}
			if(valleys[i].equals("U")) {
				level++;
				u++;
			}
			if(level==0 && u!=1) {
				count++;
			}
		}
		System.out.println(count);
		      
        

	}

}
