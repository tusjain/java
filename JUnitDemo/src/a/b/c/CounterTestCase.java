package a.b.c;

import junit.framework.TestCase;

public class CounterTestCase  extends TestCase{
	Counter counter;
	public CounterTestCase(){}
	protected void setUp(){
		counter = new Counter();
	}
	protected void tearDown(){}
	
	public void testIncrement(){
		int i1= counter.getCount();
		counter.increment();
		int i2= counter.getCount();
		boolean b1 = false;
		if (i2-i1 == 1){
			b1 = true;
		}
		assertTrue(b1);
		//assertTrue(i2-i1 == 1);
	}
	public void testDecrement(){
		int i1= counter.getCount();
		counter.decrement();
		int i2= counter.getCount();
		boolean b1 = false;
		if (i1-i2 == 1){
			b1 = true;
		}
		assertTrue(b1);
		//assertTrue(i1-i2 == 1);
	}
}