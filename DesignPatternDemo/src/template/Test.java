package template;

public class Test {
	public static void main(String[] args) {
		double d1 = 10.5, d2 = 9.5;
		float f1 = 11.5f, f2 = 12.5f;
		long l1 = 1, l2 = 2;

		int i1 = 3, i2 = 4;
		short s1 = 7, s2 = 8;
		byte b1 = 5, b2 = 6;
		AddNumber addNumber = new AddNumber();
		System.out.println(addNumber.add(d1, d2));
		System.out.println(addNumber.add(f1, f2));
		System.out.println(addNumber.add(l1, l2));
		System.out.println(addNumber.add(i1, i2));
		System.out.println(addNumber.add(s1, s2));
		System.out.println(addNumber.add(b1, b2));
	}
}
