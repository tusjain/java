public class Foo{
  public void m1( int value ){
    assert 0 <= value;
    System.out.println( "OK" );
  }
 
  public static void main( String[] args ) {
    Foo foo = new Foo();
    System.out.println( "foo.m1(  1 ): " );
    foo.m1( 1 );
    System.out.println( "foo.m1( -1 ): " );
    foo.m1( -1 );
  }
  
  /*
  public static void main( String[] args ) {
	    Foo foo = new Foo();
	    System.out.print( "foo.m1( 1 ): " );
	    foo.m1( (new Integer(args[0]).intValue()) );
	    System.out.print( "foo.m1( -1 ): " );
	    foo.m1( (new Integer(args[1]).intValue())  );
	  }
  */
}