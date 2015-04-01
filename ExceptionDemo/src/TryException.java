class TryException {
 	public static void main(String args[]){
		int d=0;
		try {
		   int a=12/d;
		   System.out.println("Not printed");
		 try{
				System.out.println("It is try with in try");
			}catch(Exception e1){
				System.out.println("It is second level of exception");
			}
		   System.out.println(" In try but after nested try");
		  
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("ArrayIndexOutOfBoundsException  :  "+ e1);
		}catch (ArithmeticException e) {
			System.out.println("Division by zero  :  "+ e);
			//e.printStackTrace();
		}catch (Exception ex){
			System.out.println("All exceptions will be caught here  :  "+ ex);
			try{
				System.out.println("It is try with in exception");
			}catch(Exception e1){
				System.out.println("It is second level of exception");
			}
			finally{
				System.out.println("This si finally in side catch");
			}
		}
		finally {
			System.out.println(" I will clean the resources here");
			try{
				System.out.println("It is try with in exception");
			}catch(Exception e2){
				System.out.println("It is second level of exception");
			}
			finally{
				System.out.println("This is finally in side finally");
			}
		}
				
				
		System.out.println("After catch");
	}
}
