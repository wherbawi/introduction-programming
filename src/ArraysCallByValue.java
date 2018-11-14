
public class ArraysCallByValue {

	public static void main(String[] args) {
		System.out.println(args[0] +" "+ args[1]);
		int[] x = { 1, 2, 3, 4, 5, 6 };
		dw(x);
		System.out.println(x);
		System.out.println(x[0]);
	}

	private static void dw(int[] y) {
		y[0] = 16;
	}

}
