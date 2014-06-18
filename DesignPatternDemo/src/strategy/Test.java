package strategy;

public class Test {
	static void goodFortune() {
		int luckyNum = new Dice().throwIt();
		FortuneCookies fc;
		switch (luckyNum) {
		case 2:
			fc = new Two();
			break;
		case 5:
			fc = new Five();
			break;
		// more
		default:
			fc = new Null();
		}
		fc.print();
	}

	public static void main(String[] args) {
		goodFortune();
	}
}
