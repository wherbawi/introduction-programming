import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = { 1, 24, 5, 3, 0, 99, 7, 6 };
		sort(d);
		System.out.println(Arrays.toString(d));

		String[] x = { "e", "r", "t", "y" };
		shift(x);
		System.out.println(Arrays.toString(x));

	}

	private static void shift(String[] x) {
		String tmp = x[0];
		for (int i = 1; i < x.length; i++) {
			x[i - 1] = x[i];
		}
		x[x.length - 1] = tmp;
		// TODO Auto-generated method stub

	}

	private static void sort(int[] d) {
		for (int j = 0; j < d.length; j++) {
			for (int i = 0; i < d.length - 1; i++) {
				if (d[i] > d[i + 1]) {
					swap(d, i, i + 1);
				}
			}
		}
	}

	private static void sortString(String[] d) {
		for (int j = 0; j < d.length; j++) {
			for (int i = 0; i < d.length - 1; i++) {
				if (d[i].compareTo(d[i + 1]) > 0) {
					swap(d, i, i + 1);
				}
			}
		}
	}

	private static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

	private static void swap(String[] x, int i, int j) {
		String temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

}
