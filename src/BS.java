
public class BS {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int index = binaryS(x, 17);
		System.out.println(index);
	}

	private static int binaryS(int[] x, int key) {

		int l = 0;
		int h = x.length - 1;

		while (l <= h) {
			int mid = (l + h) / 2;
			if (x[mid] == key)
				return mid;
			if (x[mid] < key)
				l = mid + 1;
			else
				h = mid - 1;

		}
		return -1;
	}

}
