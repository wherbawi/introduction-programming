import java.util.Scanner;

public class Cl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x;
		do {
			System.out.println("enter 1 to..");
			System.out.println("enter 2 to..");
			System.out.println("enter 3 to..");
			System.out.println("enter 4 to..");
			x = scanner.nextInt();
			switch (x) {
			case 1:
				System.out.println("enter....");

				break;
			case 2:

				break;
			case 3:
				break;
			default:
				System.out.println("inva;id");
				break;
			}
		} while (x != -1);
	}

}
