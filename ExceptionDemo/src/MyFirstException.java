public class MyFirstException {
	public static void main(String args[]){
		int d=1;
		try {
			int a=12/d;
			String str = null;
			int i = str.length();
					
			System.out.println("Not printed");
			//System.exit(0);
		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero "+  e);
			try{
				System.out.println("may generate exceptrion in catch block");
			}
			catch(Exception exc){
				System.out.println(" This is nested excetion handling - exception in a catch block");
			}
			finally{
				System.out.println("This is finally block in catch");
			}
			
			//System.exit(0);
			}
		catch (NullPointerException ne) {
			System.out.println("Handling NullPointerException "+  ne);
			}
		catch (Exception ex) {
			System.out.println("catch All "+  ex);
			}
		finally{
			System.out.println("This is finally block");
		}
		System.out.println("After try catch block");
	}
}