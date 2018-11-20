import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = { 1, 24, 5, 3, 0, 99, 7, 6 };
		sort(d);
		System.out.println(Arrays.toString(d));

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

	private static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

}
