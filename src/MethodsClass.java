
public class MethodsClass {

	public static void main(String[] args) {
		int x1 = 5;
		double d = 5.0;
		int s = 10;
		double result1 = mult(x1, d) + twice(s);
		System.out.println(fan(5));

	}

	static int twice(int r) {
		return 2 * r;
	}

	private static double mult(int x1, double d) {
		return x1 * d;

	}

	static int fan(int d) {
		return 5 + 4 * twice(d);
	}

	static void whatever() {
		whatever();
	}

}
