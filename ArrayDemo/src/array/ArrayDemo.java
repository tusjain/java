package array;

public class ArrayDemo {
	
	public String name1 = "Neel";
	public String name2 = "Vidur";
	public String name3 = "Chan";
	
	static String names[] = new String[3];
	String names2[] = {"Neel", "Vidur", "Chan"};
	
	static String houseNumber2[][] = new String[4][4];
	static int houseNumber3[][][] = new int[4][4][2];
	static int houseNumber4[][][][] = new int[6][4][2][5];
	
	public static void main(String[] args) {
		for(int i=0; i<= 2; i++){
			names[i] = "Neel" + i;
		}
		
		for(int i=0; i<= 3; i++){
			for(int j=0; j<= 3; j++){
				houseNumber2[i][j]= i + " : "+ j;
			}
		}
		
		for(int i=0; i<= 3; i++){
			for(int j=0; j<= 3; j++){
				System.out.println(houseNumber2[i][j]);
			}
		}
		
		System.out.println(" length of names: "+ names.length);
		System.out.println(" length of houseNumber3: "+ houseNumber3.length);
		System.out.println(" length of houseNumber4: "+ houseNumber4.length);
		
	}
}