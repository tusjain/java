package iteratingOverVariableLengthArgumentLists;

public class MathUtils {
	public static int max(int... values) {
	    if (values.length == 0) {
	      throw new IllegalArgumentException("No values supplied.");
	    }

	    int max = Integer.MIN_VALUE;
	    for (int i : values) {
	      if (i > max)
	        max = i;
	    }
	    return max;
	  }
	public static void main(String args[]){
		
		System.out.println(max(2,3,4));
		
		System.out.println(max());
		
		try{
			System.out.println(max(2,3,5));
			}catch(IllegalArgumentException iae){
				iae.printStackTrace();
			}
		
		try{
			System.out.println(max(2,3,5));
			}catch(IllegalArgumentException iae){
				iae.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}