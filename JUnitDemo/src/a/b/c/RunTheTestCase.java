package a.b.c;

public class RunTheTestCase {

	public static void main(String[] args) {
		Counter1TestCase ctc = new Counter1TestCase();
		ctc.setUp();
		ctc.testIncrement();
		ctc.testDecrement();
		ctc.tearDown();

	}

}
