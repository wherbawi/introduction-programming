import java.util.Scanner;

public class FindMaxOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter value of a");
		int a = input.nextInt();
		System.out.println("please enter value of b");
		int b = input.nextInt();
		System.out.println("please enter value of c");
		int c = input.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("the max is a");
			}
			if (c > a) {
				System.out.println("the max is c");
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println("max is b");
			}
			if (c > b) {
				System.out.println("max is c");
			}
		}
	}

}
