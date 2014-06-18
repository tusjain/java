public class Bar{
  public void m1( int value ){
    assert 0 <= value : "Value must be non-negative: value= " + value;
    System.out.println( "OK" );
  }
  public static void main( String[] args ){
    Bar bar = new Bar();
    System.out.print( "bar.m1(  1 ): " );
    bar.m1( 1 );
    System.out.print( "bar.m1( -1 ): " );
    bar.m1( -1 );
  }
}