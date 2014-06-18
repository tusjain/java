public class FooBar{
  public void m1( int value){
    assert 0 <= value : "Value must be non-negative: value= " + value;
    System.out.println( "OK" );
  }
  public static void printAssertionError( AssertionError ae ){
    StackTraceElement[] stackTraceElements = ae.getStackTrace();
    StackTraceElement stackTraceElement = stackTraceElements[ 0 ];
    System.err.println( "AssertionError" );
    System.err.println( "   class=   " + stackTraceElement.getClassName() );
    System.err.println( "   method=  " + stackTraceElement.getMethodName() );
    System.err.println( "   message= " + ae.getMessage() );
  }
  public static void main( String[] args ) {
    try{
      FooBar fooBar = new FooBar();
      System.out.print( "fooBar.m1(  1 ): " );
      fooBar.m1( 1 );
      System.out.print( "fooBar.m1( -1 ): " );
      fooBar.m1( -1 );
    }
    catch( AssertionError ae ){
      printAssertionError( ae );
    }
  }
}