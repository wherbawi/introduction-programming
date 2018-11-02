
public class DoWhileExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		for (int i = 0; i < 10; i++) {
			while (x < 10) {
				System.out.printf("%d * %d = %d\n", i, x, i * x);
				x++;
			}
		}
	}

}
