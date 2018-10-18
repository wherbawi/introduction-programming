import java.util.Scanner;

public class HundredHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefcde";

		for (int x = 0; x < 10; x += 2) {
			System.out.println(x);
		}

		for (int x = 10; x > 0; x--) {

		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("plz enter a number");
		int n = scanner.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
			System.out.println(sum);
		}

		while (scanner.nextInt() != -1) {
			System.out.println("please enter a number. enter -1 to exit");
		}

		do {

		} while (true && false);

		int count = 0;
		while (count < 100) {
			System.out.println("welcome to java");
			count++;
		}

	}

}
