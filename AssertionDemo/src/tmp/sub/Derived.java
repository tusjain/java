package tmp.sub;
import tmp.Base;
public class Derived extends Base{
  public void m2( boolean test){
    assert test : "Assertion failed in m2: test is " + test;
    System.out.println( "OK" );
  }
  public static void printAssertionError( AssertionError ae){
    StackTraceElement[] stackTraceElements = ae.getStackTrace();
    StackTraceElement stackTraceElement = stackTraceElements[ 0 ];
    System.err.println( "AssertionError" );
    System.err.println( "   class=   " + stackTraceElement.getClassName() );
    System.err.println( "   method=  " + stackTraceElement.getMethodName() );
    System.err.println( "   message= " + ae.getMessage() );
  }
  public static void main( String[] args ){
    try{
      Derived derived = new Derived();
      System.out.print( "derived.m1( false ): " );
      derived.m1( true );
      System.out.print( "derived.m2( false ): " );
      derived.m2( false );
    }
    catch( AssertionError ae ){
      printAssertionError( ae);
    }
  }
}