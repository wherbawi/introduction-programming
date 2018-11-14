import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "q", "r", "u", "t" };
		swap(s, 1, 3);
		System.out.println(Arrays.toString(s));
		swap(s, 0, 3);

	}

	private static void swap(String[] s, int i, int j) {
		// TODO Auto-generated method stub
		String tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

}
