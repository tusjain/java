package tmp;
public class Base{
  public void m1( boolean test){
    assert test : "Assertion failed in m1: test is " + test;
    System.out.println( "OK" );
  }
}
