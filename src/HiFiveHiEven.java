import java.util.Scanner;

public class HiFiveHiEven {

	public static void main(String[] args) {
		System.out.println("eneter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 5 == 0) {
			System.out.println("hi five");
		}

		if (a % 2 == 0) {
			System.out.println("hi even");
		}
	}

}
