package template;

public class AddNumber extends Add {
	public double add(double d1, double d2) {
		return d1 + d2;
	}

	public float add(float f1, float f2) {
		return f1 + f2;
	}

	public long add(long l1, long l2) {
		return l1 + l2;
	}

	public int add(int i1, int i2) {
		return i1 + i2;
	}

	public short add(short s1, short s2) {
		return (short) (s1 + s2);
	}

	public byte add(byte b1, byte b2) {
		return (byte) (b1 + b2);
	}

}
