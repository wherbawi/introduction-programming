import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] sum = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		float x = 15.5f;
		System.out.println("y "+Float.floatToIntBits(x));
		String a = "welcome to java";
		System.out.println(Arrays.toString(a.split(" ")));
		int result = sumelemints(sum);
		System.out.println(result);
		String[][] stds = new String[5][];
		stds[0] = new String[10];
		stds[1] = new String[3];

		System.out.println(stds[1][0]);

		String[][] st = new String[100][4];

	}

	private static int sumelemints(int[][] sum) {
		int start = 0;
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				start += sum[i][j];
			}
		}
		return start;
	}

}
