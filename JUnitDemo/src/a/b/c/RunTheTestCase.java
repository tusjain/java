package a.b.c;

public class RunTheTestCase {

	public static void main(String[] args) {
		/*
		Counter1TestCase ctc = new Counter1TestCase();
		ctc.setUp();
		ctc.testIncrement();
		ctc.testDecrement();
		ctc.tearDown();
		*/
		
		CounterTestCase ctc0 = new CounterTestCase();
		ctc0.setUp();
		ctc0.testIncrement();
		ctc0.testDecrement();
		ctc0.tearDown();

	}

}
