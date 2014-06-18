package stringTokenizer;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		String str = "This is a string to be broken down in pieces so we know how to break";
		StringTokenizer st = new StringTokenizer(str, "ng", false);
		 while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}
}