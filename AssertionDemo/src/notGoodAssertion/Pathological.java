package notGoodAssertion;

public class Pathological{
	  private String ping( boolean test)  {
	    System.err.print( "ping ... " );
	    assert test : pong( test );
	    return null;
	  }
	  private String pong( boolean test ){
	    System.err.print( "pong ... " );
	    assert test : ping( test );
	    return null;
	  }
	  public static void main( String[] args ){
	    Pathological pathological = new Pathological();
	    System.err.println( "Pathological.ping( false ): " );
	    pathological.ping( false );
	  }
}