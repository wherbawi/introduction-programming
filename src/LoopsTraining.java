
public class LoopsTraining {

	public static void main(String[] args) {

		int g = 'd';
		System.out.println((char) (g + 3));
		for (int i = 0; i < 10; i++) {
			if (i == 4)
				continue;
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);

			}
		}

		String x = "abctt";
		boolean dexists = false;
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (c == 'd') {
				dexists = true;
				// break;
			}
		}
		if (dexists)
			System.out.println("our d exists");

		String s = "dabceefes";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'd') {
				count++;
			}
		}
		if (count == 1)
			System.out.println("d exists");
		if (count > 1)
			System.out.println("d exists more than once");

	}

}
